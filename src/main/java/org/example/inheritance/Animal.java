package org.example.inheritance;

public abstract class Animal implements Huntable, Socializable {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public void eat() {
        System.out.println("animal eating");
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
