package Generics;

/**
 * The idea is to allow type (Integer, String, … etc and user defined types)
 * to be a parameter to methods, classes and interfaces.
 * For example, classes like HashSet, ArrayList, HashMap, etc use generics very well. We can use them for any type.
 */

public class NormalGenerics {
    /**
     * Single parameter based generics
     * @param t
     * @param <T>
     */
    public < T > void oneType(T t){
        System.out.println(t.toString());
    }

    /**
     * double parameter based generic methods
     * @param t
     * @param e
     * @param <T>
     * @param <E>
     */
    public <T, E > void twoType(T t, E e){
        System.out.println(t.toString() + "  " + e.toString());
    }

    /**
     * bounds to a class and its child class only
     * @param t
     * @param <T>
     */
    public < T extends User > void getInfo(T t){
        System.out.println(t.getName() + "  " + t.getDno() + "  " + t.getLocation() );
    }


}
