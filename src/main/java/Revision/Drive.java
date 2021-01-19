package Revision;

/**
 * Abstraction
 */

public class Drive extends FTP implements StateListener{

    @Override
    public void fileSizeInfo() {

    }

    @Override
    public void fileLocation() {

    }

    @Override
    public void isTransferable() {
        super.isTransferable();
    }

    @Override
    public void canBeShareable() {
        super.canBeShareable();
    }

    @Override
    public void canAddFiles() {

    }

    @Override
    public void caDeleteFiles() {

    }

    @Override
    public void canAddFolders() {

    }

    @Override
    public void canModifyFolders() {

    }
}
