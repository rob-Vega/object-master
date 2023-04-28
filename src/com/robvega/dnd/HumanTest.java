package com.robvega.dnd;

public class HumanTest {
    public static void main(String[] args) {
        Human attacker = new Human();
        Human target = new Human();

        System.out.println("Target health: " + target.getHealth());
        attacker.attack(target);
        System.out.println("Target health: " + target.getHealth());
        System.out.println("");

        Wizard wizard = new Wizard();
        System.out.println("---Wizard Stats---");
        System.out.println("strength: " + wizard.getStrength());
        System.out.println("intelligence: " + wizard.getIntelligence());
        System.out.println("stealth: " + wizard.getStealth());
        System.out.println("health: " + wizard.getHealth());

        Ninja ninja = new Ninja();
        System.out.println("---Ninja Stats---");
        System.out.println("strength: " + ninja.getStrength());
        System.out.println("intelligence: " + ninja.getIntelligence());
        System.out.println("stealth: " + ninja.getStealth());
        System.out.println("health: " + ninja.getHealth());

        Samurai samurai = new Samurai();
        Samurai anotherSamurai = new Samurai();
        System.out.println("---Samurai Stats---");
        System.out.println("strength: " + samurai.getStrength());
        System.out.println("intelligence: " + samurai.getIntelligence());
        System.out.println("stealth: " + samurai.getStealth());
        System.out.println("health: " + samurai.getHealth());

        System.out.println("\nWizard casted fireball on Samurai");
        wizard.fireball(samurai);
        System.out.println("Samurai health: " + samurai.getHealth());

        System.out.println("\nSamurai used deathblow on Wizard");
        samurai.deathBlow(wizard);
        System.out.println("Samurai health: " + samurai.getHealth());
        System.out.println("Wizard health: " + wizard.getHealth());

        System.out.println("\nNinja used steal on Samurai");
        ninja.steal(samurai);
        System.out.println("Ninja health: " + ninja.getHealth());
        System.out.println("Samurai health: " + samurai.getHealth());

        System.out.println("\nSamurai used how many");
        System.out.printf("There is %d samurais:\n", samurai.howMany());

        System.out.println("\nNinja used run away");
        ninja.runAway();
        System.out.println("Ninja health: " + ninja.getHealth());
    }
}
