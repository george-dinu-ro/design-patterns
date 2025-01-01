package my.work.creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CarFactoryTest {

	@Test
	void whenCallBuildVehicle_thenReturnCar() {
		var car = CarFactory.buildVehicle();

		assertThat(car).isInstanceOf(Car.class);
	}

	@Test
	void whenCallCreateVehicle_thenReturnCar() {
		var carFactory = new CarFactory();
		var car = carFactory.createVehicle();

		assertThat(car).isInstanceOf(Car.class);
	}
}
