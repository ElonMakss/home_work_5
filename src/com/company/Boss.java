package com.company;

public class Boss {
    private int health;
    private int strike;
    private  String SuperHit;

    public void setSuperHit(String superHit) {
        SuperHit = superHit;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSuperHit() {
        return SuperHit;
    }

    public int getStrike() {
        return strike;
    }

    public int getHealth() {
        return health;
    }
}
