package com.btb.notificationservice.common.validation.annotations;

import com.btb.notificationservice.common.validation.validators.NotNullOrEmptyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotNullOrEmptyValidator.class)
public @interface NotNullOrEmpty {

    String message() default "Value cannot be null or empty.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
