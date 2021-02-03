package components;

public class Engine {

    private double size;
    private int cylinder;
    private String fuelType; // enum??? who knows

    public Engine(double size, int cylinder, String fuelType) {
        this.size = size;
        this.cylinder = cylinder;
        this.fuelType = fuelType;
    }
}
