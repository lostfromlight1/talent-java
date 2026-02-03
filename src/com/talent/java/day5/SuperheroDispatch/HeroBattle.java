package com.talent.java.day5.SuperheroDispatch;

import java.util.ArrayList;
import java.util.List;

public class HeroBattle {
    public static void main(String[] args) {

        List<Superhero> heroes = new ArrayList<>();

        heroes.add(new FlyingHero("Superman", 80));
        heroes.add(new StrengthHero("IronFist", 50));
        heroes.add(new SpeedHero("Flash", 85));

        for (Superhero hero : heroes) {
            hero.usePower();
            hero.powerBoost(10);
            hero.usePower();
            System.out.println();
        }
    }
}
