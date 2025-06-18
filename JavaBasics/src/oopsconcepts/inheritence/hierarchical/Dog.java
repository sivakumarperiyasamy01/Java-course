package oopsconcepts.inheritence.hierarchical;

public class Dog  extends Animal {

    public void Bark() {
        System.out.println("Dog is barking");


    }

    public void eat(){
        System.out.println("dog is eating");
    }

    public String toString(){
        return "The dog name is"+name+"and color is"+color+"and age is"+age;
    }


    }


