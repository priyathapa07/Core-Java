package Revision;

public class Operations {

    //calculate the sum of a2 +2ab+b2
    public void formula(int a, int b) {

        int square = ((a*a) + (2 * a * b) + (b*b));
        System.out.println("a = "+a +" | b = "+b);
        System.out.println("a^2+2ab+b^2 is :" + square);

    }

    //print the multiplication of single given number up to 10
    public void multiplicationTable(int a) {

        for (int i = 1; i <= 10; i++) {
            int table = a * i;

            //m is converted to string
            String st = table + "";
            String s = a + "*" + i + "=" + table;
            System.out.println(s);

        }
    }

    //reverse the string using loop
    public char reverse(String a) {

        char newList = 0;
        for (int i = a.length()-1; i >= 0; i--) {
            newList = (a.charAt(i));
            System.out.print(newList);
        }
        return newList;
    }

    //notifies when the safe is unlocked
    public void safeNotification(boolean isGateOpen,boolean isRoomOpen, boolean isKeyAvailable) {
        if ((isGateOpen && isRoomOpen) && isKeyAvailable) {
            System.out.println("The safe is unlocked");

        } else {
            System.out.println("The safe is locked");
        }

    }

    public void printPattern1() {

        for (int i = 4; i >= 0; i--) {
            //System.out.print("");
            for (int j = 0; j < 5; j++) {
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}







