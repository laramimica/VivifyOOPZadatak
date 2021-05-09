package com.example;

import com.example.exceptionHandler.*;
import com.example.model.Monster;
import com.example.model.Swordsman;
import com.example.model.Weapon;
import com.example.model.Wizard;
import com.example.simulation.implementation.Simulation;
import com.example.utils.MonsterType;
import com.example.utils.WeaponType;

public class Game {

    public static void main(String[] args) throws NoWeaponException, SpellNotAllowedException, SpearNotAllowedException, SwordNotAllowedException, WeaponNumberExceeded, WeaponNotAvailableException {

        Simulation simulation = new Simulation();
        Wizard wizard = new Wizard();
        Swordsman swordsman1 = new Swordsman();
        Swordsman swordsman2 = new Swordsman();
        Monster dragon = new Monster(MonsterType.DRAGON);
        Monster spider = new Monster(MonsterType.SPIDER);
        Weapon spell = new Weapon(WeaponType.SPELL);
        Weapon sword = new Weapon(WeaponType.SWORD);
        Weapon spear = new Weapon(WeaponType.SPEAR);

        wizard.addWeaponToBackpack(spell);
        System.out.println("Dragon-wizard fight:");
        simulation.fight(dragon, wizard);
        swordsman1.addWeaponToBackpack(sword);
        System.out.println("Swordsman1 has picked up: " + sword.getWeaponType().toString());
        swordsman1.addWeaponToBackpack(spear);
        System.out.println("Swordsman1 has picked up: " + spear.getWeaponType().toString());
        System.out.println("Swordsman1 active weapon: " + swordsman1.getActiveWeapon().getWeaponType().toString());
        swordsman1.changeActiveWeapon();
        System.out.println("Swordsman1 has changed his active weapon.");
        System.out.println("Swordsman1 active weapon: " + swordsman1.getActiveWeapon().getWeaponType().toString());
        swordsman1.dismissWeapon();
        System.out.println("Swordsman1 has dismissed his active weapon.");
        System.out.println("Swordsman1 active weapon: " + swordsman1.getActiveWeapon().getWeaponType().toString());
        swordsman2.addWeaponToBackpack(spear);
        System.out.println("Swordsman2 has picked up: " + spear.getWeaponType().toString());
        System.out.println("Swordsman2 active weapon: " + swordsman2.getActiveWeapon().getWeaponType().toString());
        System.out.println("Spider-swordsman2 fight:");
        simulation.fight(spider, swordsman2);
    }
}
