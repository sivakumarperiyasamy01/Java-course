
// What is inheritence
    - Inheritence allows one class to inherit variable and methods from another class 
      or class can access fileds and methods from another class 


// Multiple inheritence 



Multiple Inheritance means a class can inherit from more than one parent class.
But in Java, multiple inheritance with classes is not allowed to avoid ambiguity (like the Diamond Problem).

class A {
void show() {
System.out.println("From A");
}
}

class B {
void show() {
System.out.println("From B");
}
}

// ❌ Invalid in Java
class C extends A, B {
// Error: Class cannot extend multiple classes
}

Java doesn't support this because if you call c.show(), Java won't know whether to use A's or B's method — that's the diamond problem.
Solution:Multiple Inheritance achieved  Using Interfaces

