public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleNumber, VehicleType vehicleType) {
        if (vehicleType == VehicleType.CAR) {
            return new Car(vehicleNumber);
        } else if (vehicleType == VehicleType.BIKE) {
            return new Bike(vehicleNumber);
        } else if (vehicleType == VehicleType.TRUCK) {
            return new Truck(vehicleNumber);
        } else {
            return null;
        }
    }
}
