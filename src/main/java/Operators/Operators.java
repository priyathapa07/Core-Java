package Operators;

/**This is Operators
 * Sample answers for Assignment_5
 * @Priya
 * @06/12/2020
 */

public class Operators {

    //Use of Operators
    public void sum(int a, int b){
        int add = a+b;
        int sub = a-b;
        int multiply = a*b;
        double divide = a/b;
        int remainder = a%b;
        System.out.println("The sum of two integers: " + a+ "+" +b+ " = "+ add );
        System.out.println("The difference of two integers: " + a+ "-" +b+ " = "+ sub);
        System.out.println("The multiplication of two integers: " + a+ "*" +b+ " = "+ multiply);
        System.out.println("The division of two integers: " + a+ "/" +b+ " = "+ divide );
        System.out.println("The remainder of two integers: " + a+ "%" +b+ " = "+ remainder );

        System.out.println();

        if (a>b){
            System.out.println(a + " is greater than " + b);
        }else{
            System.out.println(b + " is greater than " + a);
        }
        System.out.println();
    }

    //Use of AND/OR
    public void room(Boolean isGateOpen, Boolean isRoomOpen){

        if(isGateOpen && isRoomOpen){
            System.out.println("I am in the room");
        }else{
            System.out.println("I am not in room");
        }
        System.out.println();
    }

    //Use of operators
    public int local(int b){
        int a = 5;
        System.out.println("The operation is: "  +  (a+= b));
        return a;

    }

    //Factorial Problem
    public void factorial(int n){
        int fac = 1;
        for (int i= n; i>1; i--) {
            fac = fac*i;
        }
        System.out.println("The result of " + n+ "! is: " + fac);
    }

}
