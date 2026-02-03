package com.talent.java.day5.SuperheroDispatch;

public class SpeedHero extends Superhero {
    public SpeedHero(String heroName, int powerlevel) {
        super(heroName, powerlevel);
    }

    @Override
    public void usePower() {
        System.out.println(getHeroName() + " Run with powerlevel: " + getPowerLevel());
    }
}
