package com.example.exceptionHandler;

public class SwordNotAllowedException extends Exception {

    public SwordNotAllowedException() {
        super("Wizards are not allowed to use swords as a weapon.");
    }
}
