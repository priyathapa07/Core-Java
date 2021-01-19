package Generics;

public class GenericsSampleClass <T extends Vehicles> {
private T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void getInfo2(T t){
        System.out.println(t.getCompany() + " " + t.getName() + " " + t.getPlate());

    }


}
