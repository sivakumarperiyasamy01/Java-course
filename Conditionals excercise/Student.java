public class Student {
    private int marks;

    public Student(int marks) {
        this.marks=marks;
    }

    public char assignGrade() {
        // TODO: Implement the method which assigns the grade based on marks.
        
        if(marks<0 || marks>100){
             char ch1='X';
             return ch1;
        } else if (marks>=90){
             char ch2='A';
             return ch2;
        } else if (marks>=80){
             char ch3='B';
             return ch3;
        } else if (marks>=70){
             char ch3='C';
             return ch3;
        } else if (marks>=60){
             char ch4='D';
             return ch4;
        } else if (marks>=50  && marks<60){
             char ch5='E';
             return ch5;
        } else  {
             char ch6='F';
             return ch6;
        } 
        
    }
    
  
        
        
        
    
}