package com.example.model;

import com.example.utils.MonsterType;

public class Monster {

    private int health;

    private MonsterType monsterType;

    public Monster(MonsterType monsterType) {
        this.health = 100; //nije receno u tekstu zadatka
        this.monsterType = monsterType;
    }

    public int getHealth() {
        return this.health;
    }

    public void decreaseHealth(int dec) {
        this.health -= dec;
    }

    public MonsterType getMonsterType() {
        return this.monsterType;
    }
}
