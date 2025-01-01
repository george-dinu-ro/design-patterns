package my.work.creational.factory;

public class CarFactory implements VehicleFactory {

	public static Car buildVehicle() {
		return new CarFactory().createVehicle();
	}

	@Override
	public Car createVehicle() {
		return new Car();
	}
}
