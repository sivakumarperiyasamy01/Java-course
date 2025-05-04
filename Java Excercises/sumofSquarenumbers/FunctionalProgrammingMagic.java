import java.util.List;

public class FunctionalProgrammingMagic {

    public static long sumOfSquares(List<Integer> numbers) {
        
     
     if(numbers==null){
         return 0;
     };
     
      
    
    return numbers.stream().map(e->e*e).reduce(0,(total,num1)->total+num1);
    
    } 
    
}
      