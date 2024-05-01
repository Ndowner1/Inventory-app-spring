package com.example.demo.exceptions;

public class AboveMaxBelowMinException extends RuntimeException {
    public AboveMaxBelowMinException(String message) {
        super(message);
    }
}
