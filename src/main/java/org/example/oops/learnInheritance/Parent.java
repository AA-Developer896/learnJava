package org.example.oops.learnInheritance;

public class Parent {
    // Super class
    private int agePrivate;
    protected int rollProtected;
    int x = 10;

    int id = 1;
    String name = "Abhi";

    public void grandParent() {
        System.out.println("grandParent");
    }

    public void display() {
        System.out.println("parent display method");
        //System.out.println("Id: " + id + "\nName: " + name);
    }



}
