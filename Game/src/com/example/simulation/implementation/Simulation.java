package com.example.simulation.implementation;

import com.example.model.Monster;
import com.example.model.Swordsman;
import com.example.model.Wizard;
import com.example.simulation.ISimulation;
import com.example.utils.MonsterType;
import com.example.utils.WeaponType;

public class Simulation implements ISimulation {

    @Override
    public void fight(Monster monster, Wizard wizard) {

        if(wizard.getActiveWeapon() == null) {
            System.out.println("The monster has won (wizard has no active weapon).");
            return;
        }

        while(true) {
            if(getRandomNumber() < 50) {
                monster.decreaseHealth(20);
                System.out.println("The monster has been attacked by the wizard (SPELL) and has lost 20 health points.");
                if(monster.getHealth() <= 0) {
                    System.out.println("The wizard has won.");
                    break;
                }
                continue;
            }
            if(getRandomNumber() < 50) {
                wizard.decreaseHealth(5);
                System.out.println("The wizard has been attacked by the monster (PUNCH) and has lost 5 health points.");
                if(wizard.getHealth() <= 0) {
                    System.out.println("The monster has won.");
                    break;
                }
            } else {
                if(monster.getMonsterType().equals(MonsterType.DRAGON)){
                    wizard.decreaseHealth(20);
                    System.out.println("The wizard has been attacked by the dragon (FIRE) and has lost 20 health points.");
                } else {
                    wizard.decreaseHealth(8);
                    System.out.println("The wizard has been attacked by the spider (BITE) and has lost 8 health points.");
                }
                if(wizard.getHealth() <= 0) {
                    System.out.println("The monster has won.");
                    break;
                }
            }
        }
    }

    @Override
    public void fight(Monster monster, Swordsman swordsman) {

        if(swordsman.getActiveWeapon() == null) {
            System.out.println("The monster has won (swordsman has no active weapon).");
            return;
        }

        while(true) {
            if(getRandomNumber() < 50) {
                if(swordsman.getActiveWeapon().getWeaponType().equals(WeaponType.SWORD)){
                    monster.decreaseHealth(10);
                    System.out.println("The monster has been attacked by the swordsman (SWORD) and has lost 10 health points.");
                    if(monster.getHealth() <= 0) {
                        System.out.println("The swordsman has won.");
                        break;
                    }
                } else {
                    monster.decreaseHealth(15);
                    System.out.println("The monster has been attacked by the swordsman (SPEAR) and has lost 15 health points.");
                    if(monster.getHealth() <= 0) {
                        System.out.println("The swordsman has won.");
                        break;
                    }
                }
                continue;
            }
            if(getRandomNumber() < 50) {
                swordsman.decreaseHealth(5);
                System.out.println("The swordsman has been attacked by the monster (PUNCH) and has lost 5 health points.");
                if(swordsman.getHealth() <= 0) {
                    System.out.println("The monster has won.");
                    break;
                }
            } else {
                if(monster.getMonsterType().equals(MonsterType.DRAGON)){
                    swordsman.decreaseHealth(20);
                    System.out.println("The swordsman has been attacked by the dragon (FIRE) and has lost 20 health points.");
                } else {
                    swordsman.decreaseHealth(8);
                    System.out.println("The swordsman has been attacked by the spider (BITE) and has lost 8 health points.");
                }
                if(swordsman.getHealth() <= 0) {
                    System.out.println("The monster has won.");
                    break;
                }
            }
        }
    }

    private int getRandomNumber() {
        return (int) ((Math.random() * 100));
    }
}
