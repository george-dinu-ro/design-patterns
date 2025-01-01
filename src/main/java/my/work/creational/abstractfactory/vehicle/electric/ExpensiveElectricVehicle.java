package my.work.creational.abstractfactory.vehicle.electric;

public class ExpensiveElectricVehicle implements ElectricVehicle {

	@Override
	public void start() {
		System.out.println("Expensive Electric Vehicle started");
	}

	@Override
	public void stop() {
		System.out.println("Expensive Electric Vehicle stopped");
	}
}
