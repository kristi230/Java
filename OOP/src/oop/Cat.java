package oop;

public class Cat extends Animal{
    
    public Cat(){
        
    }
    
    public Cat(String name){
        this.setName(name);
    }
    public Cat(String name , int Weight){
        this.setName(name);
        this.setWeight(Weight);
    }
    public void porr(){
        System.out.println("Dorombolok");
    }
    
    @Override
    public void makeSound(){
        System.out.println("Drm Drm");
    }
    
    @Override 
    public String toString(){
        return this.getName();
    }
}
