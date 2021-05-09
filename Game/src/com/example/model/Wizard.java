package com.example.model;

import com.example.exceptionHandler.SpearNotAllowedException;
import com.example.exceptionHandler.SwordNotAllowedException;
import com.example.exceptionHandler.WeaponNotAvailableException;
import com.example.exceptionHandler.WeaponNumberExceeded;
import com.example.utils.WeaponType;

public class Wizard extends Hero {

    public Wizard() {
        super(150);
    }

    @Override
    public void addWeaponToBackpack(Weapon weapon) throws SwordNotAllowedException, SpearNotAllowedException, WeaponNumberExceeded, WeaponNotAvailableException {
        if(weapon.getWeaponType().equals(WeaponType.SWORD)) {
            throw new SwordNotAllowedException();
        } else if(weapon.getWeaponType().equals(WeaponType.SPEAR)) {
            throw new SpearNotAllowedException();
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
