public class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber, VehicleType.BIKE);
    }

    @Override
    public int getRequiredSpots() {
        return 1;
    }
}
