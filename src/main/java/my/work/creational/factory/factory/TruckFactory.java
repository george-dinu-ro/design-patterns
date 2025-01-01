package my.work.creational.factory.factory;

import my.work.creational.factory.vehicle.Truck;

public class TruckFactory implements VehicleFactory {

	public static Truck buildVehicle() {
		return new TruckFactory().createVehicle();
	}

	@Override
	public Truck createVehicle() {
		return new Truck();
	}
}
