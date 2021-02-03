package vehicles;

import components.Battery;
import components.Tyres;

public class ElectricCar extends Vehicle{

    private Battery battery;

    public ElectricCar(double price, String make, String model, Tyres tyres, String colour, Battery battery) {
        super(price, make, model, tyres, colour);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }


}
