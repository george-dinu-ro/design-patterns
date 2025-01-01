package my.work.creational.abstractfactory.vehicle.thermal;

public class CheapTermalVehicle implements ThermalVehicle {

	@Override
	public void startEngine() {
		System.out.println("Cheap thermal vehicle engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Cheap thermal vehicle engine stopped");
	}
}
