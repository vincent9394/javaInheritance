package com.agileexlab.animal;

public class Animal {
    private int age;
    private int weight;
    private  boolean running;
    private  boolean eating;

    public Animal(int age, int weight, boolean running, boolean eating){
        this.age=age;
        this.weight=weight;
        this.running=running;
        this.eating=eating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public boolean isEating() {
        return eating;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}

