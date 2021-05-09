package com.example.model;

import com.example.utils.WeaponType;

public class Weapon {

    private WeaponType weaponType;

    private boolean available;

    public Weapon() {
        this.available = true;
    }

    public Weapon(WeaponType weaponType) {
        this();
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return this.weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable() {
        this.available = !this.available;
    }
}
