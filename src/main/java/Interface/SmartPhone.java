package Interface;

/**
 * Subclass Smart phone
 * Parent class Phone
 * Implements two interface NetworkListener,WifiListener
 *
 */


public class SmartPhone extends Phone implements NetworkListener, WifiListener{


    // Inherits all tye attributes from parent class and interface class
    @Override
    public void hasDialPad() {
        super.hasDialPad();
    }

    @Override
    public void hasSpeaker() {
        super.hasSpeaker();
    }

    @Override
    public void hadListener() {
        super.hadListener();
    }

    @Override
    public void getCarrier() {

    }

    @Override
    public void checkStrength() {
        System.out.println("Strength is 5G");
    }

    @Override
    public void getNetworkType() {

    }

    @Override
    public void checkWifiStrength() {

    }

    @Override
    public void getSpeed() {

    }

    @Override
    public void getISP() {
        System.out.println("ISP is AT&T");

    }
}
