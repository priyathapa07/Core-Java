package String;
import java.util.Arrays;

/**
 * Program to use String
 *
 */

public class Sample {

    //Check Authentication based on the passed parameter
    public void checkAuthentication(String username, String password){
        if(username.equals("user")& password.equals("passkey")){
            System.out.println("Access Granted");
        }else{
            System.out.println("Access not Granted");
        }

    }

    //Check if the string is Palindrome or not
    public String  checkPalindrome(String palindrome){
        String withoutWhitespace = palindrome.replace(" ", "");
        String x = "";
        for(int i = withoutWhitespace.length()-1; i >= 0; i--){
            x += withoutWhitespace.charAt(i);
        }
        if (withoutWhitespace.equalsIgnoreCase(x)){
            System.out.println("Yes " + x +" is Palindrome");
        }else{
            System.out.println("No " + x + " is not a Palindrome");
        }
        return withoutWhitespace;
    }



    //Check if a String is anagram or not
    public boolean checkAnagram(String s1, String s2) {

        //if lengths are not equal,they are not anagram (as value is false)
        if(s1.length() != s2.length()){
            return false;
        }

        //converting to array
        char[] temps1 = s1.toCharArray();
        char[] temps2 = s2.toCharArray();

        //operation sorting
        Arrays.sort(temps1);
        Arrays.sort(temps2);

        for (int i = 0; i <= temps1.length - 1; i++) {
            // {(a!=a) = false  and goes out of if loop, but (c!=i) = true}
            if (temps1[i] != temps2[i]) {    //if this condition is true then enters inside if loop and return false
                return false; // program stops here and provides value of false
            }
        }
        return true;   //after completion of for loop, and returns true means anagram
    }


}
