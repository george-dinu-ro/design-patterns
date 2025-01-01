package my.work.creational.factory.factory;

import my.work.creational.factory.vehicle.Van;

public class VanFactory implements VehicleFactory {

	public static Van buildVehicle() {
		return new VanFactory().createVehicle();
	}

	@Override
	public Van createVehicle() {
		return new Van();
	}
}
