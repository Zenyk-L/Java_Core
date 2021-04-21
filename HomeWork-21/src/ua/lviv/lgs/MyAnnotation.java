package ua.lviv.lgs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention (RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value() default "will be saved";

}
