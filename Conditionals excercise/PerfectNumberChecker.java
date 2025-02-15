public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
       if (number<=0){
           return false;
       }
       
       int sumofdivsible=0;
       
       
       for(int i=1; i<number;i++){
           
           sumofdivsible+=(number%i==0)?i:0;
       }
       
     
       
       return sumofdivsible===number;
       
       
    }
}


