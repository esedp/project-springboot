package com.example.course.services.exceptions;

public class DatabaseException extends ResourceNotFoundException{

    private static final long serialVersionUID = 1L;

    public DatabaseException(String msg) {
        super(msg);
    }

}
