public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Create RoomInventory object
        RoomInventory inventory = new RoomInventory();

        // Display initial availability
        System.out.println("Initial Room Availability:");
        for (String roomType : inventory.getRoomAvailability().keySet()) {
            System.out.println(roomType + " -> " +
                    inventory.getRoomAvailability().get(roomType));
        }

        // Update availability
        inventory.updateAvailability("SingleRoom", 8);
        inventory.updateAvailability("DoubleRoom", 3);

        // Display updated availability
        System.out.println("\nUpdated Room Availability:");
        for (String roomType : inventory.getRoomAvailability().keySet()) {
            System.out.println(roomType + " -> " +
                    inventory.getRoomAvailability().get(roomType));
        }
    }
}