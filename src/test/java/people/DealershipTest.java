package people;

import components.Battery;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;
import vehicles.HybridCar;
import vehicles.Vehicle;

import static org.junit.Assert.*;

public class DealershipTest {

    Dealership dealership;
    Vehicle vehicle;
    ElectricCar electricCar;
    HybridCar car;
    Engine engine;
    Battery battery;
    Tyres tyres;

    @Before
    public void setUp() throws Exception {
        dealership = new Dealership("Crazy Cars", 4000);
        engine = new Engine(1.2, 4, "Petrol");
        battery = new Battery("Lithium Ion", 6, 62);
        tyres = new Tyres("Bridgestone", 28);
        car = new HybridCar(30000, "Toyota", "Prius", tyres, "Blue", engine);
        electricCar = new ElectricCar(10000, "Nissan", "Leaf", tyres, "Silver", battery);
    }

    @Test
    public void hasName() {
        assertEquals("Crazy Cars", dealership.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(4000, dealership.getTill(), 0.0);
    }

    @Test
    public void canChangeTill() {
        dealership.setTill(50000);
        assertEquals(50000, dealership.getTill(), 0.0);
    }

    @Test
    public void vehiclesListStartsEmpty() {
        assertEquals(0, dealership.getVehiclesForSale().size());
    }

    @Test
    public void canAddVehicle() {
        dealership.addVehicle(car);
        dealership.addVehicle(electricCar);
        assertEquals(2, dealership.getVehiclesForSale().size());
    }
}