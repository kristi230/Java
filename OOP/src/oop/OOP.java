package oop;

import java.util.ArrayList;

public class OOP {

    public static void main(String[] args) {

        ArrayList<Animal> cats = new ArrayList<Animal>();
        Cat sziamiau = new Cat();
        cats.add(sziamiau);

        Dog morzsi = new Dog();
        cats.add(morzsi);
        
        System.out.println(sziamiau.toString());

        System.out.println(sziamiau.getClass());
        
        Dog.Bark();

    }

}
