package com.example.exceptionHandler;

public class NoWeaponException extends Exception {

    public NoWeaponException() {
        super("Hero's backpack is empty.");
    }
}
