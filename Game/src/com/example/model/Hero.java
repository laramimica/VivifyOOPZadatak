package com.example.model;

import com.example.exceptionHandler.*;

public abstract class Hero {

    private int health;

    Weapon activeWeapon;

    Backpack backpack;

    public Hero(int health) {
        this.health = health;
        this.backpack = new Backpack();
    }

    public abstract void addWeaponToBackpack(Weapon weapon) throws SwordNotAllowedException, SpearNotAllowedException, SpellNotAllowedException, WeaponNumberExceeded, WeaponNotAvailableException;

    public void decreaseHealth(int dec) {
        this.health -= dec;
    }

    public int getHealth() {
        return this.health;
    }

    public Weapon getActiveWeapon() {
        return this.activeWeapon;
    }

    public void changeActiveWeapon() throws NoWeaponException {
        if(this.backpack.getWeapons().size() < 2) {
            throw new NoWeaponException();
        }
        if(this.backpack.getWeapons().get(0) == this.activeWeapon) {
            this.activeWeapon = this.backpack.getWeapons().get(1);
            return;
        }
        this.activeWeapon = this.backpack.getWeapons().get(0);
    }

    public void dismissWeapon() {
        try {
            changeActiveWeapon();
            if(this.backpack.getWeapons().get(0) == this.activeWeapon) {
                this.backpack.getWeapons().get(1).setAvailable();
                this.backpack.getWeapons().remove(this.backpack.getWeapons().get(1));
            } else {
                this.backpack.getWeapons().get(0).setAvailable();
                this.backpack.getWeapons().remove(this.backpack.getWeapons().get(0));
            }
        } catch (NoWeaponException e) {
            this.backpack.getWeapons().remove(this.activeWeapon);
            this.activeWeapon.setAvailable();
            this.activeWeapon = null;
        }
    }
}
