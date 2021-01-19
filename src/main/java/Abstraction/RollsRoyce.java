package Abstraction;

/**
 * create a child class RollsRoyce
 * class that extends parent class Vehicles
 * implements all abstract methods compulsorily
 */

public class RollsRoyce extends Vehicle {
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
        System.out.println("It has many lights");

    }

    @Override
    public void hasDoor() {
        System.out.println("The room has only one door");

    }
}
