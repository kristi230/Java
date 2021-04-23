package javaap;

public class OBSFJ1 {

    public static void main(String[] args) {
        
        Human first = new Human();
       
        first.setName("Gyula");

        System.out.println(first.getName() == null ? "Üres" : "Nem üres: " + first.getName());
               
        Cat  hello = new Cat();
        hello.makeSound();
        hello.layDown();
    }

}
