package my.work.creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TruckFactoryTest {

	@Test
	void whenCallBuildVehicle_thenReturnTruck() {
		var truck = TruckFactory.buildVehicle();

		assertThat(truck).isInstanceOf(Truck.class);
	}

	@Test
	void whenCallCreateVehicle_thenReturnTruck() {
		var truckFactory = new TruckFactory();
		var truck = truckFactory.createVehicle();

		assertThat(truck).isInstanceOf(Truck.class);
	}
}
