package Overloading;

/**
 * This is Assignment-2
 * Constructor/method/overloading
 * @author Priya
 * @version 0.0.0
 * @since June 10,2020
 */

    public class Overloading {

    private String name;
    private long years;
    private Integer a, b, c;

    //Empty/default Constructor
    public Overloading(){

    }

    /**
     * this method displays the string passed
     * @param name-- String
     */

    // Constructor with 1 Parameter String
    public Overloading(String name){
        this.name = name;
        System.out.println(name);
    }

    /**
            * this method displays 2 parameters passed
     * @param name--String
     * @param years--long
     */

    // Constructor with 2 Parameters: String and long
    public Overloading(String name, long years){
        this.name = name;
        this.years = years;
        System.out.println("The name is:" + name + "    The years is: " + years);
    }

    /**
     * this method shows the sum
     * of two integers passed
     * @param a--integer
     * @param b--integer
     */

    //
    public void sum(int a, int b){
        int add = a + b;
        System.out.println("The sum of two integers are:  " + add);
    }


    /**
     * this method displays the sum of
     * 3 integers passed
     * @param a--integer
     * @param b--integer
     * @param c--integer
     */

    public void sum(int a, int b, int c){

        System.out.println ( "The sum of 3 integers are:" + (a + b + c));
    }

}
