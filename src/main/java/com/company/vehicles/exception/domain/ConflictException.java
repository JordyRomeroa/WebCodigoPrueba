package com.company.vehicles.exception.domain;

import com.company.vehicles.exception.base.ApplicationException;

public class ConflictException extends ApplicationException {
    public ConflictException(String message) {
        super(HttpStatus.CONFLICT, message);
    }
}
