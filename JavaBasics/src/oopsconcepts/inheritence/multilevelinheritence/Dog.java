package oopsconcepts.inheritence.multilevelinheritence;

public class Dog  extends Animal{

    String color;
    String breed;

    public void bark() {
        System.out.println("Dog is barking");
    }


    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", color=" + color + ", breed=" + breed + "]";
    }

}
