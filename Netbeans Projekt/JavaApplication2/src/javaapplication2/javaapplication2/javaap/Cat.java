package javaap;

public class Cat extends Animal implements Pet {

    public Cat() {
        this.setName("Robi");
    }
  
    public Cat(String Name, int weight){
        this.setName(Name);
        this.setWeight(weight);
    }    

    public Cat(int weight ,String Name){
        this.setName(Name);
        this.setWeight(weight);
    }   


    @Override
    public void layDown() {
        System.out.println("Down");
        
    }

    @Override
    public void makeSound() {
        System.out.println("MeoW");
    }

}
