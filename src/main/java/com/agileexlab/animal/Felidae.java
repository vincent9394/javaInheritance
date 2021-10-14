package com.agileexlab.animal;

public class Felidae extends Animal{
    private boolean meowSound;


    public Felidae(int age, int weight, boolean running, boolean eating, boolean meowSound) {
        super(age, weight, running, eating);
        this.meowSound=meowSound;
    }

    public void setMeowSound(boolean meowSound) {
        this.meowSound = meowSound;
    }

    public boolean isMeowSound() {
        return meowSound;
    }
}
