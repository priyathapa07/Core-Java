package Annotations;

/**
 *  a custom annotation which can be applied to a class, interface or enum
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)  //to use above class not in methods
public @interface customAnnotationClass {
}
