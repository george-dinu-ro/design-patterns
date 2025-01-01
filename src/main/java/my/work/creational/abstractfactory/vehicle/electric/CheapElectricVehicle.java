package my.work.creational.abstractfactory.vehicle.electric;

public class CheapElectricVehicle implements ElectricVehicle {

	@Override
	public void start() {
		System.out.println("Cheap Electric Vehicle started");
	}

	@Override
	public void stop() {
		System.out.println("Cheap Electric Vehicle stopped");
	}
}
