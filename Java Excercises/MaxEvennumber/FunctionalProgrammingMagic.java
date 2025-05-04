import java.util.List;
import java.util.Optional;

public class FunctionalProgrammingMagic {

    public static int findMaxEvenNumber(List<Integer> numbers) {
      
      if(numbers==null){
          return 0;
      }
      
      
Optional<Integer>maxeven=numbers.stream().filter(e->e%2==0).max((n1,n2)->Integer.compare(n1,n2));

return maxeven.orElse(0);
      
      
    }   
      
}