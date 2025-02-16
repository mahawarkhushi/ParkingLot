public class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.CAR);
    }

    @Override
    public int getRequiredSpots() {
        return 1;
    }
}
