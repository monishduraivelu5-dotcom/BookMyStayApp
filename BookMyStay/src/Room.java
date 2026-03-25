// Abstract Class Room
abstract class Room {
    // Attributes
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    // Constructor
     Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Number of Beds: " + numberOfBeds);
        System.out.println("Room Size (sq ft): " + squareFeet);
        System.out.println("Price per Night: ₹" + pricePerNight);
        System.out.println("-----------------------------");
    }
}

// SingleRoom Class
class SingleRoom extends Room {

    // Constructor
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

// DoubleRoom Class
class DoubleRoom extends Room {

    // Constructor
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

// Main Class
 class HotelTest {
    public static void main(String[] args) {

        // Create objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();

        // Display details
        System.out.println("Single Room Details:");
        single.displayRoomDetails();

        System.out.println("Double Room Details:");
        doubleRoom.displayRoomDetails();
    }
}