package String;

public class Result {

    public static void main(String[]args){
        Sample s1 = new Sample();
        s1.checkAuthentication("user","passkey");
        System.out.println();
        s1.checkPalindrome("refer");
        System.out.println();
        s1.checkPalindrome("Never odd or even");

        Sample sample = new Sample();

        if(sample.checkAnagram("beard", "brade")){
            System.out.println("They are Anagram");
        }else{
            System.out.println("They are not Anagram");
        }

    }
}
