package com.example.simulation;

import com.example.model.Monster;
import com.example.model.Swordsman;
import com.example.model.Wizard;

public interface ISimulation {

    void fight(Monster monster, Wizard wizard);

    void fight(Monster monster, Swordsman swordsman);
}
