package my.work.creational.factory;

public class TruckFactory implements VehicleFactory {

	public static Truck buildVehicle() {
		return new TruckFactory().createVehicle();
	}

	@Override
	public Truck createVehicle() {
		return new Truck();
	}
}
