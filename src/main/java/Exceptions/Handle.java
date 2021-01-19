package Exceptions;

/**
 * program to handle the NullPointerException
 * handle the ArithmeticException
 *  handle the NumberFormatException
 *  handle the IndexOutOfBoundException
 *  handle the ArrayIndexOutOfBoundException
 *  use throws, throw and finally
 */

public class Handle {

    //Sample of Null Pointer Exceptions
    public void VerifyNullPointer() {
        String test = null;

        //this throws NullPointerExceptions as test is empty
        if (test.equals("Hello")) {
            System.out.println("There is no null pointer");
        }
    }

    //Handling a NullPointerException
        public void checkNullPointer(String ptr){
            try{
                if (ptr.equals("Hello")){
                    System.out.println("The ptr is not empty and can be comparable");
                }

                //ptr is empty and throws it to the catch block.
            }catch (NullPointerException e){
                System.out.println("Strings cannot be empty");

            }
        }


        //Handling a ArithmeticExceptions
        public void arithmeticExceptionsExamples(int a, int b) throws ArithmeticException{
        int result = 0;
        try{
            if(b == 0){
                throw new ArithmeticException();
            }else{
                result = a/b;
                System.out.println(result);
            }

        } catch (ArithmeticException e){
            System.out.println("Cannot be divided by 0");
        }
    }

        //Handling a NumberFormatExceptions
        public void numberFormatExceptionExample(String InputString){

//        String InputString ="123 ";
//        Integer a = Integer.parseInt(InputString);
//            System.out.println("Invalid String arguments");

            try{
                Integer a = Integer.parseInt(InputString);
                System.out.println(a);

            }catch(NumberFormatException e) {
                System.out.println("Invalid String arguments; should be a number");
            }
        }

        //Handling StringIndexOutOfBound Exception
        public void indexOutOFBoundExample(String a){
        try {
            char list = a.charAt(9);
            System.out.println(list);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("index should be in range");
        }
    }

    //Handling ArrayIndexOutOfBounds Exception
    public void arrayIndexOutOfBoundsExample(int a){
        try{
        int array[] = {10,20,40,60,80};
        System.out.println(array[a]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Has to be within the index");
        }finally {
            System.out.println("Use value within index");
        }

    }

}
