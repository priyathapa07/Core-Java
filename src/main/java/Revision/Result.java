package Revision;

public class Result {

    public static void main(String[] args) {

        Operations o1 = new Operations();
        o1.formula(2, 2);
        System.out.println();
        o1.multiplicationTable(7);
        System.out.println();
        o1.safeNotification(true, true, true);
        o1.printPattern1();
        o1.reverse("Hello");


        //check the polymorphic nature
        Accountant a1 = new Accountant();
        if (a1 instanceof Employee) {

        }
        Manager m1 = new Manager();
        if (m1 instanceof Employee){

        }
    }
}

