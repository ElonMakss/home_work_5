package com.company;

public class Main {
    public static void main(String[] args) {
        Boss ilonMusk = new Boss();
        ilonMusk.setHealth(2500);
        ilonMusk.setStrike(200);
        ilonMusk.setSuperHit("создает много спутников");
        System.out.println("Health = " + ilonMusk.getHealth() + " Strike = " + ilonMusk.getStrike() + " " +
                " Super Strike " + ilonMusk.getSuperHit());
        System.out.println("=============================");

        for (Hero hero:createHeroes()) {
            System.out.println("-----------------------------");
            System.out.println("Health = " + hero.getHealth() + " Strike = " +
                    hero.getStrike() + " Super Strike -  " +
                    hero.getSuperHit());

        }
    }

    public static Hero[] createHeroes() {
        Hero voznik = new Hero(25, 250, "заговаривает тех. литературой");
        Hero besus = new Hero(15, 150, "закидывает деньгами");
        Hero jesuus = new Hero(99, 99, "делает вино");
        Hero bashkaSiliconValley = new Hero (9, 15);
        Hero[] heroes = new Hero[4];
        heroes[0] = voznik;
        heroes[1] = jesuus;
        heroes[2] = besus;
        heroes[3] = bashkaSiliconValley;

        return heroes;
    }
}
