package Inheritance;

public class Dell extends Computer{

    public void hasWirelessNetwork(){
        System.out.println("It has wireless Network");
    }
    public void hasHDMI(){
        System.out.println("No HDMI port");
    }

    //Inherit from Parent Class Computer

    @Override
    public void hasCPU() {
        super.hasCPU();
    }

    @Override
    public void hasScreen() {
        super.hasScreen();
    }

    @Override
    public void hasKeyword() {
        super.hasKeyword();
    }

    @Override
    public void hasRAM() {
        super.hasRAM();
    }
}
