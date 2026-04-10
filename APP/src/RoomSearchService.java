import java.util.Map;

/**
 *
 * CLASS RoomSearchService
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * This class provides search functionality
 * for guests to view available rooms.
 *
 * It reads room availability from inventory
 * and room details from Room objects.
 *
 * No inventory mutation or booking logic
 * is performed in this class.
 *
 * @version 4.0
 */

public class RoomSearchService {

    /**
     * Displays available rooms along with
     * their details and pricing.
     *
     * This method performs read-only access
     * to inventory and room data.
     *
     * @param inventory centralized room inventory
     * @param singleRoom single room definition
     * @param doubleRoom double room definition
     * @param suiteRoom suite room definition
     */

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("===== AVAILABLE ROOMS =====");

        // Check Single Room
        if (availability.get("SingleRoom") > 0) {
            System.out.println("\nSingle Room Available:");
            singleRoom.displayRoomDetails();
            System.out.println("Available count: "
                    + availability.get("SingleRoom"));
        }

        // Check Double Room
        if (availability.get("DoubleRoom") > 0) {
            System.out.println("\nDouble Room Available:");
            doubleRoom.displayRoomDetails();
            System.out.println("Available count: "
                    + availability.get("DoubleRoom"));
        }

        // Check Suite Room
        if (availability.get("SuiteRoom") > 0) {
            System.out.println("\nSuite Room Available:");
            suiteRoom.displayRoomDetails();
            System.out.println("Available count: "
                    + availability.get("SuiteRoom"));
        }
    }
}