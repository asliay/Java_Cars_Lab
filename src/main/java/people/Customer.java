package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    // EXTENSION: Allow a customer to buy a vehicle.

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

}
