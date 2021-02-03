package components;

public class Battery {

    private String type;
    private int fullChargeTime;
    private int capacity;

    public Battery(String type, int fullChargeTime, int capacity) {
        this.type = type;
        this.fullChargeTime = fullChargeTime;
        this.capacity = capacity;
    }
}
