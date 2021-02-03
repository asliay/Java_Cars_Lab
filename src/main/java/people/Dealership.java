package people;

import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

        private String name;
        private double till;
        private ArrayList<Vehicle> vehiclesForSale;

    public Dealership(String name, double till) {
        this.name = name;
        this.till = till;
        this.vehiclesForSale = new ArrayList<>();
    }

    // EXTENSIONS:
    // Allow dealership to buy vehicles
    // Allow Dealerships to sell vehicles to customers.
    // Allow dealership to repair vehicles. This should take the cost from the dealer and add back to value of vehicle.

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double amount) {
        this.till = amount;
    }

    public ArrayList<Vehicle> getVehiclesForSale() {
        return vehiclesForSale;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehiclesForSale.add(vehicle);
    }


}


