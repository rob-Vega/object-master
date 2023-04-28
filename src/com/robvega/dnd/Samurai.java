package com.robvega.dnd;

public class Samurai extends Human {
    private static int samuraiCount = 0;
    public Samurai() {
        super();
        this.setHealth(200);
        samuraiCount++;
    }

    public void deathBlow(Human human) {
        human.setHealth(human.getHealth() - human.getHealth());
        this.setHealth(this.getHealth() / 2);
    }

    public void meditate() {
        this.setHealth(this.getHealth() + (this.getHealth() / 2));
    }

    public int howMany() {
        return samuraiCount;
    }

}
