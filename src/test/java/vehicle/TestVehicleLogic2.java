package vehicle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Vehicle;
import model.VehicleBusinessLogic;

public class TestVehicleLogic2 {

	VehicleBusinessLogic vehicleBL = new VehicleBusinessLogic();
	Vehicle vehicle = new Vehicle("Toyota Venza");
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testVehicleDrive1() {
		vehicle.setDrive("FWD");
		double discountMargin  = vehicleBL.vehicleDriveSale(vehicle);
		assertEquals(1000, discountMargin,0.0);
	}
	
	@Test
	public void testVehicleDrive2() {
		vehicle.setDrive("4WD");
		double discountMargin  = vehicleBL.vehicleDriveSale(vehicle);
		assertEquals(2000, discountMargin,0.0);
	}
}
