package oopsconcepts.Encapsulation;

public class Student {

 private  String name;
    int age;
    int marks;

    public String getName() {
        return name;
    }

    public   void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }


   public  String toString(){
        return "this student name is"+name + " and age is "+age+" and marks is "+marks;
    }
}
