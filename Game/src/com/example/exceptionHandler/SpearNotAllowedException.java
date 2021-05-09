package com.example.exceptionHandler;

public class SpearNotAllowedException extends Exception {

    public SpearNotAllowedException() {
        super("Wizards are not allowed to use spears as a weapon.");
    }
}
