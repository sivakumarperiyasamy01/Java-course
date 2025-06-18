package oopsconcepts.inheritence.multilevelinheritence;

public class Cat extends Dog {

    void meow() {
        System.out.println("Cat is meowing");
    }


    public String toString() {
        return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", breed=" + breed + "]";
    }
}
