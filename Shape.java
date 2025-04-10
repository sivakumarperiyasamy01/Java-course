abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

// TODO: Create a Circle class that extends Shape
// The Circle class should have a private double radius attribute and a constructor to initialize it
// It should also implement the calculateArea() method 


class Circle extends Shape{
    
  private Double Radius;
    
   public Circle(String name,Double radius){
        super(name);
        this.Radius=radius;
    }
    
   public double calculateArea(){
       return Math.PI * Radius * Radius;
   }
    
    
    
}










class Rectangle extends Shape{
    
    private Double Length;
    private Double Width;
    
    Rectangle(String name, Double Width, Double Length){
        
        super(name);
        
        this.Length=Length;
        this.Width= Width;
        
        
    }
    
    
  public double calculateArea(){
        return Length*Width;
    }
    
    
    
}



// TODO: Create a Rectangle class that extends Shape
// The Rectangle class should have private double attributes for length and width, and a constructor to initialize them
// It should also implement the calculateArea() method 
