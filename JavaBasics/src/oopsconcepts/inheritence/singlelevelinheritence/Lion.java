package oopsconcepts.inheritence.singlelevelinheritence;



// Lion is sub class of Animal super class or( parent class), // inheriting its properties and methods using extends keyword
public class Lion extends Animal {
    String color;


    Lion(){
        super("lion");
        System.out.println("Lion constructor");
    }



    // toString method to return a string representation of the Lion object
    @Override
  public String toString(){
        return String.format("Animal lion name is %s, age is %d, and color is %s",name,age,color);
    }

}






