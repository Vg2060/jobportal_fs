package com.example.exception;
import java.lang.Exception;
/**
 * JobNotFoundException
 */
public class JobNotFoundException extends RuntimeException {

    public JobNotFoundException(String message) {
        super(message);
    }
    
}