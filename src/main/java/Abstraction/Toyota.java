package Abstraction;

/**
 * create a child class Toyota
 * class that extends parent class Vehicles
 * implements all abstract methods compulsorily
 */


public class Toyota extends Vehicle {
    @Override
    public void hasSteering() {
        super.hasSteering();
    }

    @Override
    public void hasHorn() {
        super.hasHorn();
    }

    @Override
    public void hasBumper() {
        super.hasBumper();
    }

    @Override
    public void hasBrake() {
        super.hasBrake();
    }

    @Override
    public void hasConvertibleRoof() {
        super.hasConvertibleRoof();
    }

    @Override
    public void hasFloatingDoor() {
        super.hasFloatingDoor();
    }

    @Override
    public void hasDriverSheet() {

    }

    @Override
    public void hasWheels() {

    }

    @Override
    public void hasLights() {

    }

    @Override
    public void hasDoor() {
        System.out.println("The room has two doors");

    }
}
