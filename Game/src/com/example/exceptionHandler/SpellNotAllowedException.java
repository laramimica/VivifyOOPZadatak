package com.example.exceptionHandler;

public class SpellNotAllowedException extends Exception {

    public SpellNotAllowedException() {
        super("Swordsmen are not allowed to do spells.");
    }
}
