package oopsconcepts.Encapsulation;

public class Main {

    public static void main(String[] args) {

      Student s1=  new Student();

      s1.setName("John");
      s1.setAge(23);
      s1.setMarks(100);

      System.out.println(s1.getAge());

      System.out.println(s1);

    }
}
