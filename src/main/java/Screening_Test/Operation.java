package Screening_Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Operation {

    //prints hours and minutes in seconds
    public void printSeconds(int hours, int minutes) {
        int seconds = hours * 60 * 60 + minutes * 60;
        System.out.println("Converting " + hours + " hour and " + minutes + "minutes " + " to seconds:" + seconds);
        System.out.println();

    }

    //Accepting a single digit number and printing the multiplication below 100
    public void printMultiplications(int n) {

        System.out.println("The multiplication table of " + n + " is:");
        int multiple = 0;
        int index = 1;
        while (true) {
            multiple = n * index;

            if (multiple > 100) {
                break;
            }
            System.out.println(n + " * " + index + " = " + multiple);
            index++;
        }
    }

    //finds the position of a word in a String
    public void findPosition() {
        String str = "The quick brown fox jumps over the white lazy dog";
        char myChar = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            myChar = str.charAt(i);
            if (myChar == 'l') {
                System.out.println();
                System.out.println("The position of l is at: " + i);
                break;
            }
        }
    }

    //arrange the array lexicographic-all
    public void arrangeLexicographically(String[] list){

        System.out.println();
        System.out.println("Original list[] :" + Arrays.toString(list));

        for (int i=0; i<list.length-1;i++){
            for(int j=0;j <list.length-i-1;j++){
                if((list[j].compareTo(list[j+1]))>0) {
                    String tempStr = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tempStr;
                }
            }
        }
        System.out.println("Modified list[] :" + Arrays.toString(list));

    }

    //Using Hashmap to print the key and value of String whose value is raspberry
    public void checkHashValue(int key){
        HashMap<Integer,String> fruits = new HashMap<>();
        fruits.put(1, "Orange");
        fruits.put(5, "Apple");
        fruits.put(3, "Mango");
        fruits.put(7, "Raspberry");
        fruits.put(9, "Grapes");
        fruits.put(10, "Kiwi");
        fruits.put(2, "Banana");
        fruits.put(4, "Guava");

        System.out.println();
        System.out.println("The key is " + key + " and the value is " + fruits.get(key));

    }

    /**accepts double digit as integer n via parameters
     * and prints the “Hello World” nth times
     * or prints at least 1 time if n=0
     */
    public void doubleDigit(int n){
        System.out.println();

        if(n<10||n>99){
            if(n==0){
                System.out.println("Hello World");
            }else {
                System.out.println("Integer is not double digit.");
            }
        }else{
            for(int i=1; i<=n; i++){
                System.out.println(i+". Hello World");
            }
        }
    }


    // Rock paper scissor that should be played between User and Computer.
    public void game(String rps){

        int r = 0;
        int p = 1;
        int s = 2;

        String[] game ={"rock","paper","scissor"} ;
        Random random = new Random();
        int cc = random.nextInt(3);
        int mc = 0;

        for(int i=0; i<=2; i++){
            if(rps.equalsIgnoreCase(game[i])){
                mc = i;
            }
        }

        System.out.println();
        System.out.println("My Choice - "+game[mc].toUpperCase());
        System.out.println("Computer Choice - "+game[cc].toUpperCase());

        if(mc==cc){
            System.out.println("Its a tie with my " + game[mc].toUpperCase() + " over computer's " + game[cc].toUpperCase());

        }else if( (mc==r && cc==s) || (mc==p && cc==r) || (mc==s && cc==p) ){
            System.out.println("I won with " + game[mc].toUpperCase() + " over computer's " + game[cc].toUpperCase());
        }else if((mc==s && cc==r) || (mc==r && cc==p) || (mc==p && cc==s)){
            System.out.println("Computer won with " + game[cc].toUpperCase() + " over my choice " + game[mc].toUpperCase());
        }



    }



}

