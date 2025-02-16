public class Floor {
    private int floorNumber;
    private int totalSpots;
    private int availableSpots;
    private String[] parkedVehicles;

    public Floor(int floorNumber, int totalSpots) {
        this.floorNumber = floorNumber;
        this.totalSpots = totalSpots;
        this.availableSpots = totalSpots;
        this.parkedVehicles = new String[totalSpots];
    }

    public boolean parkVehicle(Vehicle vehicle) {
        int spotsRequired = vehicle.getRequiredSpots();
        if (availableSpots >= spotsRequired) {
            for (int i = 0; i < totalSpots; i++) {
                if (parkedVehicles[i] == null) {
                    parkedVehicles[i] = vehicle.getVehicleNumber();
                    availableSpots -= spotsRequired;
                    System.out.println(vehicle.getVehicleNumber() + " parked on floor " + floorNumber + ", spot " + i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean parkTruck(Vehicle vehicle) {
        for (int i = 0; i < totalSpots - 1; i++) {
            if (parkedVehicles[i] == null && parkedVehicles[i + 1] == null) {
                parkedVehicles[i] = vehicle.getVehicleNumber();
                parkedVehicles[i + 1] = vehicle.getVehicleNumber();
                availableSpots -= 2;
                System.out.println(vehicle.getVehicleNumber() + " parked on floor " + floorNumber + ", spots " + i + " and " + (i + 1));
                return true;
            }
        }
        return false;
    }

    public boolean removeVehicle(String vehicleNumber) {
        for (int i = 0; i < totalSpots; i++) {
            if (parkedVehicles[i] != null && parkedVehicles[i].equals(vehicleNumber)) {
                parkedVehicles[i] = null;
                availableSpots++;
                System.out.println("Vehicle " + vehicleNumber + " has left the parking lot from floor " + floorNumber + ", spot " + i);
                return true;
            }
        }
        return false;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
