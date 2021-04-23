package javaap;

import jdk.javadoc.internal.doclets.toolkit.OverviewElement;

public class Cat extends Feline implements Pet {
    
    @Override
    public void layDown() {
        System.out.println("Down");
        
    }

    @Override
    public void makeSound() {
        System.out.println("MeoW");
    }

}
