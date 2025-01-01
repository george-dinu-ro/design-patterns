package my.work.creational.factory.vehicle;

public class Van implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Van engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Van engine stopped");
	}
}
