package Screening_Test;

public class Main_Operation {

    public static void main(String []args){
        Operation o1 = new Operation();
        o1.printSeconds(1, 2);
        o1.printMultiplications(3);
        o1.findPosition();
        String[] words = {"cow","dog","rape","monkey","zebra","buffalo","giraffe"};
        o1.arrangeLexicographically(words);
        o1.checkHashValue(7);
        o1.doubleDigit(11);
        o1.game("paper" );
    }
}
