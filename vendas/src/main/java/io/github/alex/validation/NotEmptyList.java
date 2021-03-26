package io.github.alex.validation;

import io.github.alex.validation.constraintvalidation.NotEmptyListValidator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author Alex
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NotEmptyListValidator.class)
public @interface NotEmptyList {

    String message() default "A lista não pode ser vazia.";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
