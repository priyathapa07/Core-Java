package Generics;
/**
 * a generic class which accepts 1 type of generics
 */

public class GenericsSample<T> {
    private T t;

    public GenericsSample(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
