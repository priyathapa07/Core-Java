package Annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //should be above method
public @interface customAnnotationMethod {
}
