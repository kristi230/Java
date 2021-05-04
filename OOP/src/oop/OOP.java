package oop;

import java.util.ArrayList;

public class OOP {

    public static void main(String[] args) {
        
        ArrayList<Animal> cats = new ArrayList<Animal>();
        Cat sziamiau = new Cat();
        cats.add(sziamiau);
        
        Cat cat =(Cat) cats.get(0);
        cat.porr();
        
        
       
    }

}
