package com.example.model;

import com.example.exceptionHandler.WeaponNumberExceeded;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Weapon> weapons;

    public Backpack() {
        this.weapons = new ArrayList<>();
    }

    public List<Weapon> getWeapons() {
        return this.weapons;
    }

    public void addWeapon(Weapon weapon) throws WeaponNumberExceeded {
        if(this.weapons.size() >= 2) {
            throw new WeaponNumberExceeded();
        }
        this.getWeapons().add(weapon);
    }
}
