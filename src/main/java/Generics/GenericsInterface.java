package Generics;

/**
 * Create an interface which accepts 1 type as generics
 * With two abstract methods
 * @param <T>
 */

public interface GenericsInterface<T> {

    public  <T> void getValue(T t);
    public abstract void hasOneAbstract();
    public abstract void hasTwoAbstract();
}
