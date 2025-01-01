package my.work.creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class VanFactoryTest {

	@Test
	void whenCallBuildVehicle_thenReturnVan() {
		var van = VanFactory.buildVehicle();

		assertThat(van).isInstanceOf(Van.class);
	}

	@Test
	void whenCallCreateVehicle_thenReturnVan() {
		var vanFactory = new VanFactory();
		var van = vanFactory.createVehicle();

		assertThat(van).isInstanceOf(Van.class);
	}
}
