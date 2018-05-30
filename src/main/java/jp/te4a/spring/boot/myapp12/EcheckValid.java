package jp.te4a.spring.boot.myapp12;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = EcheckValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface EcheckValid {
	String param();
    String message() default  "input other than  {param}.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};

}
