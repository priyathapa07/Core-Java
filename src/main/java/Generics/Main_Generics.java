package Generics;

public class Main_Generics {
    public static void main(String[] args) {
        NormalGenerics normalGenerics = new NormalGenerics();

        System.out.println("Single parameter based generics:");
        normalGenerics.oneType(new String("Hello java"));
        normalGenerics.oneType(12345);
        System.out.println();

        System.out.println("Double parameter based generics:");
        normalGenerics.twoType("Priya", 12345);
        System.out.println();

        System.out.println("bounds to a class and its child class only:");
        User user = new User("Science", 1, "Harren Hall");
        Teacher teacher = new Teacher("Hunter", 2, "Computer and Math");
        Student student = new Student("Priya", 3, "Bld-6");
        normalGenerics.getInfo(user);
        normalGenerics.getInfo(student);
        System.out.println();

        System.out.println("A generic class which accepts 1 type of generics:");
        GenericsSample<Integer> genericsSample = new GenericsSample(1234);
        System.out.println(genericsSample.getT());
        System.out.println();

        System.out.println("A generic class which accepts 2 different types of generics:");
        GenericSample2<Integer,String> genericSample2 = new GenericSample2(7,"Priya");
        System.out.println(genericSample2.getT() + " " + genericSample2.getE());
        System.out.println();

        System.out.println("A generic class which accepts a POJO class Vehicle and its child (Car , Bus and Bike)");
        GenericsSampleClass<Vehicles>genericsSampleClass = new GenericsSampleClass<>();
        Vehicles vehicles = new Vehicles(1, "Bus-car-Bike", "XYZ");
        Car car = new Car(2,"Mercedes-Benz","European Car");
        Bike bike = new Bike(3,"Honda", "Hon");
        Bus bus = new Bus(4,"ABC", "zzz");
        genericsSampleClass.getInfo2(bus);
        genericsSampleClass.getInfo2(car);
        genericsSampleClass.getInfo2(bike);




    }
}
