package runningCount;

import java.util.Scanner;

public class Main_Running {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0, rc = 0;


        while(true){
            System.out.print("Number: ");
            in = sc.nextInt();

            if(in>=2 && in<=6){
                rc = rc + 1;

            }else if(in==10 || in==11){
                rc = rc - 1;
            }

            System.out.println("RC: " + rc);
        }

    }
}
