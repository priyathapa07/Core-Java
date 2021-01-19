package Data_types;


public class DataTypes {
    private boolean flag;

    public  void data(){
       int  number = 20;
       System.out.println(number/5);

    }

    public void checkFlag(){
        if(flag){
        System.out.println("true");
        }
        else {
         System.out.println("false");
            }
        }
    

    public void checkInteger(){
        int one = 123;
    }
    public void checkDouble(){
        double two = 2.3;
        System.out.println(two);
    }

    public void checkCharacter(){
        char character = 'a';
        System.out.println(character);
    }

    public void parseInteger(){
        String text = "11111";
        Integer x= Integer.parseInt(text);
        int z = 1;
        Integer y = x+z;
        System.out.println(y);
    }
}
