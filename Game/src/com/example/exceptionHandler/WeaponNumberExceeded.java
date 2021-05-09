package com.example.exceptionHandler;

public class WeaponNumberExceeded extends Exception {

    public WeaponNumberExceeded() {
        super("Weapon number exceeded. Backpacks can carry max 2 weapons.");
    }
}
