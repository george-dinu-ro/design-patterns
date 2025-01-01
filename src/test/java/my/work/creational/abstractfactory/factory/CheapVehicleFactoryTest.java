package my.work.creational.abstractfactory.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import my.work.creational.abstractfactory.vehicle.electric.CheapElectricVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.CheapTermalVehicle;

class CheapVehicleFactoryTest {

	private static CheapVehicleFactory factory;

	@BeforeAll
	private static void init() {
		factory = new CheapVehicleFactory();
	}

	@Test
	void whenCallCreateThermalVehicle_thenReturnCheapTermalVehicle() {
		var vehicle = factory.createThermalVehicle();
		vehicle.startEngine();
		vehicle.stopEngine();

		assertThat(vehicle).isInstanceOf(CheapTermalVehicle.class);
	}

	@Test
	void whenCallCreateElectricVehicle_thenReturnCheapElectricVehicle() {
		var vehicle = factory.createElectricVehicle();
		vehicle.start();
		vehicle.stop();

		assertThat(vehicle).isInstanceOf(CheapElectricVehicle.class);
	}
}
