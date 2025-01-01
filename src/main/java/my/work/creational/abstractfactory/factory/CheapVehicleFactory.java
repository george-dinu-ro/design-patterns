package my.work.creational.abstractfactory.factory;

import my.work.creational.abstractfactory.vehicle.electric.CheapElectricVehicle;
import my.work.creational.abstractfactory.vehicle.electric.ElectricVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.CheapTermalVehicle;
import my.work.creational.abstractfactory.vehicle.thermal.ThermalVehicle;

public class CheapVehicleFactory implements VehicleFactory {

	@Override
	public ThermalVehicle createThermalVehicle() {
		return new CheapTermalVehicle();
	}

	@Override
	public ElectricVehicle createElectricVehicle() {
		return new CheapElectricVehicle();
	}
}
