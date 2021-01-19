package Revision;

/**
 * Abstraction
 */

public abstract class FTP {

    public abstract void fileSizeInfo();
    public abstract  void fileLocation();

    public void isTransferable(){
        System.out.println("Yes");
    }

    public void canBeShareable(){
        System.out.println("yes");
    }
}
