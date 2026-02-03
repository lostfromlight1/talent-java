package com.talent.java.day5.SuperheroDispatch;

public abstract class Superhero {
    private String heroName ;
    private int powerLevel;

    Superhero(String heroName, int powerLevel){
        this.heroName = heroName;
        this.powerLevel = powerLevel;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public abstract void usePower();

    public void powerBoost(int boostAmount) {
        powerLevel += boostAmount;
        System.out.println(heroName + " power boosted! New power level: " + powerLevel);
    }
}
