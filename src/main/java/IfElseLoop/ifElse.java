package IfElseLoop;

/**This is ifElse
 * Sample answers for Assignment_3
 * @Priya
 * @06/10/2020
 */

public class ifElse {

    //To check if an integer between 1 and 9 is a single digit or not
    public void checkSingleDigit(int n){
        if ( n > 0 && n < 10 ){
            System.out.println( "You entered: " +n+ "."+ " It is a Single Digit");
        }else{
            System.out.println( "You entered: " +n + "." + " It is not a Single Digit");
        }
    }


    /** a method which accept int 1,2 or 3
     * and print in as One, Two or Three
     * @param n
     */

    public void words (int n){
        if(n == 1){
            System.out.println( "You entered: One");
        }else if(n == 2){
            System.out.println("You entered: Two");
        }else if(n == 3){
            System.out.println("You entered: Three");
        }else{
            System.out.println("Not valid");
        }

    }

    //doubles the  int if it is even and subtract -1 if odd
    public void checkEvenOdd(int n){

        if(n%2 == 0){
            System.out.println(n*2);
        }else{
            System.out.println(n-1);
        }
    }

}
