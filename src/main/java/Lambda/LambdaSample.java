package Lambda;

import java.util.Collections;
import java.util.List;

public class LambdaSample {

    private int division;

    /**
     * lambda expression of no parameter
     */
    public void noParameter(){
        One no_parameter = ()-> System.out.println("It has no Parameter");
        no_parameter.getValue();
    }

    /**
     * lambda expression of single parameter (define type on parameter)
     */
    public void singleParameter(){
        SingleParameter singleParameter =(x)-> x;
        System.out.println( singleParameter.num(8));
    }

    /**
     *  Lambda expression of multiple parameter
     */
    public void multipleParameter(){
        MultipleParameter multipleParameter = ( x, y, z)-> x+y*z;
        System.out.println(multipleParameter.operation(2, 3, 3));
    }

    /**
     * lambda expression with code block
     */
    public void codeBlock(){
        codeBlockSample CBS = (a,b,c) ->{
            if (a == 0)
                System.out.println("cannot be zero");
            else
                division =  ((b+c)/a);
            System.out.println("The sum is: " + division);
        };
       CBS.mathematically(2, 4, 2);

    }

    /**
     * lambda expression with Generic types
     */
    public void genericInterface(){
        GenericsSample <List>genericsSample = (s)-> System.out.println(s);
        genericsSample.getValue(Collections.singletonList(1));

    }

    /**
     * lambda expression as arguments
     */

    public void argumentsparam(){
        ArgumentParameter ap = (s) -> s;
        arguments(ap,"Priya");
    }

    private void arguments(ArgumentParameter ap, String s){
        String word = " Hey!";
        String wordList = word + ap.passArguments(s);
        System.out.println(wordList);
    }


}
