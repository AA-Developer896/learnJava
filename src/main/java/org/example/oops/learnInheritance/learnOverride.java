package org.example.oops.learnInheritance;

public class learnOverride  extends Child{

    int x = 30;



    @Override
    public void display() {
        //super.display();
        System.out.println("child display method");
        //System.out.println("Id: " + id + "\nName: " + name);
    }

    public void display(int a) {
        //super.display();
        System.out.println("int child display method");
        System.out.println(((Parent)this).x);
        //System.out.println();
        ((Parent)this).display();
       // super.
        //System.out.println("Id: " + id + "\nName: " + name);
    }

    public void display(int a, int b) {
        //super.display();
        System.out.println("child display method");
        //System.out.println("Id: " + id + "\nName: " + name);
    }

}
