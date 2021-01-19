package Annotations;

/** a classes with use case of
 * @Override
 * @Deprecated
 * @SuppressWarnings
 */


import com.sun.istack.internal.NotNull;
@customAnnotationClass

public class UseCase {

    @customAnnotationField(value = "Priya")
     private String add;

    //a custom annotation which can be applied to a method
    @customAnnotationMethod
    //override
    public void method1(){
        System.out.println("This is method1");
    }

    public void method2(@NotNull Integer String){

    }

    //Both have same functionality but has been replaced by newer form "recent"
    @Deprecated
    public void old(){
        System.out.println();
    }

    public void recent(){
        System.out.println();
    }



}
