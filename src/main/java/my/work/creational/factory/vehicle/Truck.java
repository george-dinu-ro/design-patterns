package my.work.creational.factory.vehicle;

public class Truck implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Truck engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Truck engine stopped");
	}
}
