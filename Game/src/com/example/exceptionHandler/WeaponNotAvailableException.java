package com.example.exceptionHandler;

public class WeaponNotAvailableException extends Exception {

    public WeaponNotAvailableException() {
        super("Weapon is not available.");
    }
}
