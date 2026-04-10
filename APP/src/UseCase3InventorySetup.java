/**
 *
 * MAIN CLASS UseCase3InventorySetup
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Description:
 * This class demonstrates how room availability
 * is managed using a centralized inventory.
 *
 * Room objects are used to retrieve pricing
 * and room characteristics.
 *
 * No booking or search logic is introduced here.
 *
 * @version 3.1
 */

public class UseCase3InventorySetup {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Create centralized inventory
        RoomInventory inventory = new RoomInventory();

        System.out.println("===== CENTRALIZED ROOM INVENTORY =====");

        System.out.println("\nSingle Room Details:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: "
                + inventory.getRoomAvailability().get("SingleRoom"));

        System.out.println("\nDouble Room Details:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: "
                + inventory.getRoomAvailability().get("DoubleRoom"));

        System.out.println("\nSuite Room Details:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: "
                + inventory.getRoomAvailability().get("SuiteRoom"));

        // Example update
        inventory.updateAvailability("SingleRoom", 4);

        System.out.println("\nUpdated SingleRoom Availability: "
                + inventory.getRoomAvailability().get("SingleRoom"));
    }
}