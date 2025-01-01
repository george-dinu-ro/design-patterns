package my.work.creational.factory;

public class VanFactory implements VehicleFactory {

	public static Van buildVehicle() {
		return new VanFactory().createVehicle();
	}

	@Override
	public Van createVehicle() {
		return new Van();
	}
}
