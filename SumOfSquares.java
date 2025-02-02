public class SumOfSquares {
    public long calculateSumOfSquares(int n) {
       if(n<0){
           return -1;
       }
       
        long Total=0;
       for(int i=1;i<=n;i++){
           
            
           Total+= i*i;
            
       }
       
      return Total;
    }
}