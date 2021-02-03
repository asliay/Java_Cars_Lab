package vehicles;

import components.Tyres;

public abstract class Vehicle {

    private double price;
    private String make;
    private String model;
    private Tyres tyres;
    private String colour;

    // EXTENSIONS:
    // Allow damage to be added to a vehicle. This should be a cost and be removed from vehicles price.
    // Allow dealership to repair vehicles. This should take the cost from the dealer and add back to value of vehicle.
    public Vehicle(double price, String make, String model, Tyres tyres, String colour) {
        this.price = price;
        this.make = make;
        this.model = model;
        this.tyres = tyres;
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public String getColour() {
        return colour;
    }
}
