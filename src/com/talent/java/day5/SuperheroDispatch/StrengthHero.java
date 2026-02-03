package com.talent.java.day5.SuperheroDispatch;

public class StrengthHero extends Superhero {

    public StrengthHero(String heroName, int powerLevel) {
        super(heroName, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println(getHeroName() + " smashes enemies with super strength! Power level: " + getPowerLevel());
    }
}