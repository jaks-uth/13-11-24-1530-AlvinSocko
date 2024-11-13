package pl.example.vehicles;

public class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }
    public int getMaxSpeed() {
        return 50;
    }
}
