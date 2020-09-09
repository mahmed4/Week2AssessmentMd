package vehicle;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import model.Vehicle;
import model.VehicleBusinessLogic;

public class TestVehicleLogic1 {

	
	VehicleBusinessLogic vehicleBL = new VehicleBusinessLogic();
	Vehicle vehicle = new Vehicle("Toyota Venza");

	@Before
	public void setUp() throws Exception {
		
	}
	
	// vehicle name test
	
	@Test
	public void testVehicleName1() {
		vehicle.setName("");
		assertFalse(vehicleBL.vehicleName(vehicle));
	}
	
	@Test
	public void testVehicleName2() {
		vehicle.setName("Toyota Corolla");
		assertTrue(vehicleBL.vehicleName(vehicle));
	}
	
	// vehicle year test
	
	@Test
	public void testVehicleYear1() {
		vehicle.setYear(2020);
		assertTrue(vehicleBL.vehicleYear(vehicle));
	}
	
	@Test
	public void testVehicleYear2() {
		vehicle.setYear(2021);
		assertFalse(vehicleBL.vehicleYear(vehicle));
	}
}
