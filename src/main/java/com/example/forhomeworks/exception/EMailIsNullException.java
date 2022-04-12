package com.example.forhomeworks.exception;

import org.hibernate.criterion.NullExpression;

public class EMailIsNullException extends RuntimeException {
    public EMailIsNullException(String propertyName) {
        super(propertyName);
    }
}
