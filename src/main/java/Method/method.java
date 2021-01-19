package Method;


public class method {
    private boolean isActiveSession = true;


    public void sum(int a, int b, int c) {
        int add = a + b;
        int multiply = add * c;
        System.out.println(" The value of (a+b)*c is:" + multiply);
    }

    public void checkSession() {

        if (isActiveSession) {
            //active session is true
            //write your program flow.
            System.out.println("Yes");
        } else {
            //active session is false
            System.out.println("No");
        }
    }

    public void printCharacter() {
        char character1 = 'a';
        char character2 = 'e';
        char character3 = 'i';
        char character4 = 'o';
        char character5 = 'u';

        //String x = "" + 'a'+'e'+'i'+'o'+'u';
        //System.out.println(x);

        System.out.print(character1);
        System.out.print(character2);
        System.out.print(character3);
        System.out.print(character4);
        System.out.println(character5);

    }

    public static void subtract(double a, double b) {
        //use static: to call method without creating instance of that class
        double negative = b - a;
        System.out.println("The subtraction of double type is:" + negative);
    }

    public void minus(float a, float b){
        float result = b-a;
        System.out.println("The subtraction of float is:" + result);

    }

    public void addLong(long a, long b, long c){
        long addition = a+b+c;
        System.out.println(" The addition of long is: " + addition);

    }

    public void parseFloat(){
        String a = "111111";
        float x = Float.parseFloat(a);
        float y = (float) 1.9;
        float z = x + y;
        System.out.println("The conversion of Sting to a float: " + z);

    }

    public void parseDouble(){
        String text = "555555";
        double a = Double.parseDouble(text);
        double b = 2.5;
        double c = a +b;
        System.out.println("The conversion of a String to double: " + c);
    }
}
