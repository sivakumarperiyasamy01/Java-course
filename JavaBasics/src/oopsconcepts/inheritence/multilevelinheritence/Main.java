package oopsconcepts.inheritence.multilevelinheritence;

public class Main {
    public static void main(String[] args) {
// multilevel inheritance-cat inherits from Dog, which inherits from Animal
       Cat cat = new Cat();
       cat.name = "Whiskers";
       cat.age=6;
       cat.color = "White";

// single level inheritance-dog inherits from Animal
       Dog dog = new Dog();
       dog.name = "Buddy";
       dog.age=4;
       dog.color = "Black";
       dog.breed="Labrador";

       dog.bark();
    System.out.println( dog.toString());
System.out.println( cat.toString());

    }
}
