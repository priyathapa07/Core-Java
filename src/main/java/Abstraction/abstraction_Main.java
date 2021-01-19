package Abstraction;


public class abstraction_Main {

    public static void main(String[]args) {

        //cannot make object of abstract class
        RollsRoyce rollsRoyce = new RollsRoyce();
        rollsRoyce.hasLights();
        rollsRoyce.hasDoor();
        rollsRoyce.hasSteering();

        Toyota t1 = new Toyota();
        t1.hasDoor();

    }

}
