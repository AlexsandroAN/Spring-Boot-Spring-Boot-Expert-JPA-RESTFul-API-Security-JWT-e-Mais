package io.github.alex.validation.constraintvalidation;

import io.github.alex.validation.NotEmptyList;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Alex
 */
public class NotEmptyListValidator
        implements ConstraintValidator<NotEmptyList, List> {

    @Override
    public boolean isValid(List list,
            ConstraintValidatorContext cvc) {
        return list != null && !list.isEmpty();
    }

    @Override
    public void initialize(NotEmptyList constraintAnnotation) {

    }

}
