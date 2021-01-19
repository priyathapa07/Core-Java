package LoopSample;


/**This is loop
 * Sample answers for Assignment_4
 * @Priya
 * @06/11/2020
 */

public class Loop {

    //print the pattern below using for loops
    public void pattern() {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
                 System.out.println();
        }
        System.out.println();
    }




    //prints the pattern using the while loop
    public void pattern2() {
//       int i=54321;
//        int j=10000;
//        while(j>=1){
//            System.out.println(i/j);
//            j = j/10;
//        }

        //prints the pattern using the while loop
        int i = 5, j;
        while (i >= 1) {
            j = 5;
            while (j >= i) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i--;
        }
        System.out.println();
    }



    //print number of times passed via parameter (using do while loop)
    public void checkDoWhile(int n) {
        do {
            System.out.println("Hello java");
            n++;
        }while(n<6);
    }
}





