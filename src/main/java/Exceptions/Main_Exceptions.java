package Exceptions;

public class Main_Exceptions {

    public static void main(String []args){

        Handle h = new Handle();
       // h.VerifyNullPointer();
        h.checkNullPointer(null);
        h.arithmeticExceptionsExamples(10, 0);
        h.numberFormatExceptionExample("werdsf");
        h.indexOutOFBoundExample("two");
        h.arrayIndexOutOfBoundsExample(10);

    }

}
