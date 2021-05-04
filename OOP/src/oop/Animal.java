package oop;

public abstract class Animal {

    private String name;
    private int Size;
    private int Weight;

    public Animal() {
        this.name = "Gyula";
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void makeSound(){
        System.out.println("AAAAAA");
    }

}
