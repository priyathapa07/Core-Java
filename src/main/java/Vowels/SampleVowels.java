package Vowels;

import java.util.ArrayList;
import java.util.List;


//Remove vowels from a word
public class SampleVowels {
    public void checkVowel(String s) {

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

       String temp ="";

        for (int i = 0; i <= s.length()- 1; i++) {
            char ch = s.charAt(i);
            
        //use this for array list
        //    if(!vowels.contains(ch)){
            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'||
                    ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
            }else{
                temp += ch;
            }
        }
       // System.out.println(s);
        System.out.println(temp);
    }

    //get the second highest letter in a string
    public void secondHighest(String s){

        //splitting string into words and putting into array
        String [] words = s.split(" ");

        String s1 = "";
        String s2 = "";

        //to have second highest, needed at least two words
        if(words.length>1){
            if(words[0].length()>words[1].length()){
                s1 = words[0];
                s2 = words[1];
            }else{
                s1 = words[1];
                s2 = words[0];
            }
        }else{
            System.out.println("There is no second highest.");
        }
        for (int i = 2; i<words.length; i++){

            if(s1.length() > words[i].length()){
                if(s2.length()<words[i].length()){
                    s2 = words[i];
                }
            }else{
                s2 = s1;
                s1 = words[i];
            }
        }
        System.out.println(words.toString());
        System.out.println("first longest: "+s1);
        System.out.println("second longest: "+s2);

    }
}

