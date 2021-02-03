package vehicles;

import components.Engine;
import components.Tyres;

public class HybridCar extends Vehicle{

    private Engine engine;

    public HybridCar(double price, String make, String model, Tyres tyres, String colour, Engine engine) {
        super(price, make, model, tyres, colour);
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }


}
