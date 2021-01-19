package Abstraction;

/**
 * creating abstract class
 * using the keywords abstract class
 */

public abstract class Vehicle {
    //abstract methods
    public abstract void hasDriverSheet();
    public abstract void hasWheels();
    public abstract void hasLights();
    public abstract void hasDoor();

    //Normal Methods
    public void hasSteering(){
        System.out.println("yes, Steering");

    }

    public void hasHorn(){

    }

    public void hasBumper(){

    }

    public void hasBrake(){

    }

    public void hasConvertibleRoof(){

    }

    public void hasFloatingDoor(){

    }
}
