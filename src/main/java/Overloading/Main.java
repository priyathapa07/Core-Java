package Overloading;

public class Main {

    public static void main(String[]args){

        Overloading Ol = new Overloading("Priya");
        Overloading ol = new Overloading("Rose",999999);
        ol.sum(1,2);
        ol.sum(1,1,1);
    }
}
