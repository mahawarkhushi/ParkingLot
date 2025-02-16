import java.util.*;

public class ParkingLot {
    private List<Floor> floors;
    private final int numFloors;
    private final int spotsPerFloor;

    public ParkingLot(int numFloors, int spotsPerFloor) {
        this.numFloors = numFloors;
        this.spotsPerFloor = spotsPerFloor;
        this.floors = new ArrayList<>();
        for (int i = 0; i < numFloors; i++) {
            floors.add(new Floor(i, spotsPerFloor));
        }
    }

    public boolean parkVehicle(String vehicleNumber, VehicleType vehicleType) {
        Vehicle vehicle = VehicleFactory.createVehicle(vehicleNumber, vehicleType);

        for (Floor floor : floors) {
            if (vehicle.getRequiredSpots() == 1) {
                if (floor.parkVehicle(vehicle)) {
                    return true;
                }
            } else if (vehicle.getRequiredSpots() == 2) {
                if (floor.parkTruck(vehicle)) {
                    return true;
                }
            }
        }
        System.out.println("Parking lot is full. Cannot park the vehicle.");
        return false;
    }

    public boolean removeVehicle(String vehicleNumber) {
        for (Floor floor : floors) {
            if (floor.removeVehicle(vehicleNumber)) {
                return true;
            }
        }
        System.out.println("Vehicle not found: " + vehicleNumber);
        return false;
    }

    public void displayAvailableSpots() {
        for (Floor floor : floors) {
            System.out.println("Floor " + floor.getFloorNumber() + ": " + floor.getAvailableSpots() + " spots available");
        }
    }

    public boolean isFull() {
        for (Floor floor : floors) {
            if (floor.getAvailableSpots() > 0) {
                return false;
            }
        }
        return true;
    }
}
