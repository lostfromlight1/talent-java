package com.talent.java.day5.SuperheroDispatch;

public class FlyingHero extends Superhero {
    public FlyingHero(String heroName, int powerlevel) {
        super(heroName, powerlevel);
    }

    @Override
    public void usePower() {
        System.out.println(getHeroName() + " Fly with powerlevel: " + getPowerLevel());
    }
}
