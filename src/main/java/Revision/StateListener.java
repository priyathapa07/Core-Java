package Revision;

/**
 * Abstraction
 */
public interface StateListener {

    public void canAddFiles();
    public void caDeleteFiles();
    public void canAddFolders();
    public void canModifyFolders();

}
