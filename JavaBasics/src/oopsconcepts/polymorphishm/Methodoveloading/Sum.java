package oopsconcepts.polymorphishm.Methodoveloading;

public class Sum {


// Method overloading

  public static void calculate(int a, int b){
        System.out.println("Sum is:"+(a+b));
    }


    public static void calculate(int a, int b,int c){
        System.out.println("Sum is:"+(a*b*c));
    }

    public static  void calculate(double a, double b){
        System.out.println("Sum is:"+(a/b));
    }


}
