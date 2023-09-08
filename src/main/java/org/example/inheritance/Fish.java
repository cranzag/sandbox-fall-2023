package org.example.inheritance;

public class Fish extends Amphibian {

    public Fish(String name) {
        super(name);
    }

    public Fish() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Fish is making sound");
    }

}
