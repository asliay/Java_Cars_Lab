package people;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;
import vehicles.Vehicle;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    HybridCar car;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Reince Priebus", 100000);
        engine = new Engine(1.2, 4, "Petrol");
        tyres = new Tyres("Bridgestone", 28);
        car = new HybridCar(30000, "Toyota", "Prius", tyres, "Blue", engine);
    }

    @Test
    public void hasName() {
        assertEquals("Reince Priebus", customer.getName());
    }

    @Test
    public void hasMoney() {
        assertEquals(100000, customer.getMoney(), 0.0);
    }

    @Test
    public void canChangeMoney() {
        customer.setMoney(50000);
        assertEquals(50000, customer.getMoney(), 0.0);
    }

    @Test
    public void vehiclesListStartsEmpty() {
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void canAddVehicle() {
        customer.addVehicle(car);
        assertEquals(1, customer.getVehicles().size());
    }
}