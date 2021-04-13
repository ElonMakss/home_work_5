package com.company;

public class Hero {
    private int strike;
    private int health;
    private String superHit;

    public Hero(int strike, int health, String superHit){
        this.strike = strike;
        this.health = health;
        this.superHit = superHit;
    }

    public Hero(int strike, int health){
        this.strike = strike;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperHit() {
        return superHit;
    }

    public int getStrike() {
        return strike;
    }

    public void setSuperHit(String superHit) {
        this.superHit = superHit;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }
}
