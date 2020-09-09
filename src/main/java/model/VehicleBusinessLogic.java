package model;

import java.util.Calendar;

public class VehicleBusinessLogic {
	
	Calendar calendar = Calendar.getInstance();
	
	// make sure vehicle must have a name to be listed
	public boolean vehicleName(Vehicle vehicle) {
		boolean isVehicleName = false;
		if(vehicle.getName() == " " || vehicle.getName() == "") {
			isVehicleName = false;
		}else {
			isVehicleName = true;
		}
		return isVehicleName;
		}
	
	// make sure if any one search for future year model vehicle it will false/fail the test 
	public boolean vehicleYear(Vehicle vehicle) {
		boolean isVehicleYear = false;
		if(vehicle.getYear() > Calendar.getInstance().get(Calendar.YEAR)) {
			isVehicleYear = false;
		}else {
			isVehicleYear = true;
		}
		return isVehicleYear;
	}
	
	public double vehicleDriveSale(Vehicle vehicle) {
		double saleOption = 0.0;
		if(vehicle.getDrive().equals("FWD")) {
			saleOption = 1000;
		}else {
			saleOption = 2000;
		}
		return saleOption;
	}
	}

