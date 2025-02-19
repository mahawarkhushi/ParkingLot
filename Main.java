import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(3, 10);
        
        while (true){
            System.out.println("\n1. Park Vehicle\n2. Remove Vehicle\n3. Display Available Spots\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vehicleNumber = scanner.nextLine();
                    System.out.print("Enter vehicle type (CAR/BIKE/TRUCK): ");
                    String type = scanner.nextLine().toUpperCase();
                    VehicleType vehicleType = VehicleType.valueOf(type);
                    if (!parkingLot.parkVehicle(vehicleNumber, vehicleType)){
                        System.out.println("Cannot park the vehicle.");
                    }
                    break;

                case 2:
                    System.out.print("Enter vehicle number to remove: ");
                    String vehicleToRemove = scanner.nextLine();
                    if (!parkingLot.removeVehicle(vehicleToRemove)) {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                case 3:
                    parkingLot.displayAvailableSpots();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
