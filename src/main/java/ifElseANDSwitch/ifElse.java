package ifElseANDSwitch;

/**This is ifElse
 * Sample statements
 * @Priya
 * @06/10/2020
 */

public class ifElse {
    public void checkDivisible(int n) {
        //int divider=2;

        if (n % 2 == 0) {
            System.out.println("The number is divisible by 2 ");
        } else {
            System.out.println("It's not divisible");
        }
    }

    //if statement
    public void checkFlag(boolean flag) {
        if (flag) {
            System.out.println("Yes/flag");
            return;
        }
        System.out.println("No/flag");
    }

    //elseif
    public void checkScore(int score) {
        if (score < 40) {
            System.out.println("The student has failed");
        } else if (score >= 40 && score < 60) {
            System.out.println("The student has just passed");
        } else if (score >= 60 && score < 90) {
            System.out.println("The student has pass with good grades");
        } else {
            System.out.println("The student has scored excellent");
        }
    }

    //Nested if
    public void checkNested(int score) {
        if (score > 60) {
            if (score >= 60 && score < 70) {
                System.out.println("The student has just passed");
            } else if (score >= 70 && score < 85) {
                System.out.println("The student has pass with good grades");
            } else {
                System.out.println("It is a excellent Score");
            }
        }

        else {
            if (score <= 60 && score > 50) {
                System.out.println("Student has poor performance");
                }else{
                System.out.println("Student failed");
            }
            }
        }
    }

