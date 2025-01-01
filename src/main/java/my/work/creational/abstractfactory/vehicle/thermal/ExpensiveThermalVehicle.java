package my.work.creational.abstractfactory.vehicle.thermal;

public class ExpensiveThermalVehicle implements ThermalVehicle {

	@Override
	public void startEngine() {
		System.out.println("Expensive thermal vehicle engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Expensive thermal vehicle engine stopped");
	}
}
