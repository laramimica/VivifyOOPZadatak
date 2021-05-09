package com.example.model;

import com.example.exceptionHandler.SpellNotAllowedException;
import com.example.exceptionHandler.WeaponNumberExceeded;
import com.example.exceptionHandler.WeaponNotAvailableException;
import com.example.utils.WeaponType;

public class Swordsman extends Hero {

    public Swordsman() {
        super(100);
    }

    public void addWeaponToBackpack(Weapon weapon) throws SpellNotAllowedException, WeaponNumberExceeded, WeaponNotAvailableException {
        if(weapon.getWeaponType().equals(WeaponType.SPELL)) {
            throw new SpellNotAllowedException();
        } else if(!weapon.isAvailable()) {
            throw new WeaponNotAvailableException();
        }
        this.backpack.addWeapon(weapon);
        weapon.setAvailable();
        if(this.getActiveWeapon() == null) {
            this.activeWeapon = weapon;
        }
    }
}
