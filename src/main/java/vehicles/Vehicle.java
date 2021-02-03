package vehicles;

import components.Tyres;

public abstract class Vehicle {

    private double price;
    private String make;
    private String model;
    private Tyres tyres;
    private String colour;

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
