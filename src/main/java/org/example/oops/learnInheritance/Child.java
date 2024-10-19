package org.example.oops.learnInheritance;

public class Child extends Parent {
    // subclass
    String city = "Saharsa";
    int x = 20;

    public void displayCity(){
        System.out.println("City: " + city);
    }

    @Override
    public void display() {
        super.display();
    }
}
