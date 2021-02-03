package vehicles;

import components.Battery;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricCarTest {

    Tyres tyres;
    Battery battery;
    ElectricCar car;

    @Before
    public void setUp() throws Exception {
        battery = new Battery("Lithium Ion", 6, 62);
        tyres = new Tyres("Bridgestone", 28);
        car = new ElectricCar(10000, "Nissan", "Leaf", tyres, "Silver", battery);
    }

    @Test
    public void hasPrice() {
        assertEquals(10000, car.getPrice(), 0.0);
    }

    @Test
    public void hasMake() {
        assertEquals("Nissan", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Leaf", car.getModel());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasColour() {
        assertEquals("Silver", car.getColour());
    }

    @Test
    public void getBattery() {
        assertEquals(battery, car.getBattery());
    }
}