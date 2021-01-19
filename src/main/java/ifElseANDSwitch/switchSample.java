package ifElseANDSwitch;

/**This is ifElse
* Sample statements
* @Priya
* @06/10/2020
*/

public class switchSample {


    public void upgrade(int grade){
       switch (grade){

           case  1:
               System.out.println("The student's grade is: A");
               break;

           case  2:
               System.out.println("The student's grade is: B");
               break;

           case 3:
               System.out.println("The student's grade is: C");
               break;

           default:
               System.out.println("Invalid Input");

       }
    }
}

