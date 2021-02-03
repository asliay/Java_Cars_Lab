package vehicles;


import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombustionCarTest {

    CombustionCar car;
    Tyres tyres;
    Engine engine;

    @Before
    public void setUp() throws Exception {
        engine = new Engine(1.2, 4, "Petrol");
        tyres = new Tyres("Bridgestone", 28);
        car = new CombustionCar(20000, "Ford", "Fiesta", tyres, "Blue", engine);
    }

    @Test
    public void hasPrice() {
        assertEquals(20000, car.getPrice(), 0.0);
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Fiesta", car.getModel());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }
}