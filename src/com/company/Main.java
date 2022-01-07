package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(15);
        boss.setHealth(860);
        boss.setSuperPower("SuperPower");
        System.out.println(boss.getDamage());
        System.out.println(boss.getHealth());
        System.out.println(boss.getSuperPower());
        Hero[] heroes = createHeroes();

        for (int i = 0; i < heroes.length ; i++){
            System.out.println(heroes[i].getDamage()+ heroes [1].getHealth()+heroes[1].getSuperPower());
            System.out.println("String" +10);
        }


    }

    public static Hero[] createHeroes() {
        Hero magic = new Hero(170,20,"darkness");
        Hero physical = new Hero(200,15);
        Hero dragon = new Hero(270,20);
        return new Hero[] {magic,physical,dragon};
    }


}