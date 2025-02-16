public class Truck extends Vehicle {
    public Truck(String vehicleNumber) {
        super(vehicleNumber, VehicleType.TRUCK);
    }

    @Override
    public int getRequiredSpots() {
        return 2;
    }
}
