public class StringMagic {

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        
     
                if(str==null){
                    return false;
                }
     
     // counter the edger cases in loop itself
                int count=str.length();
                if(count<=1){
                    return false;
                }
                
                // helloworld
                
                for(int i=0; i<str.length()-1; i++){
                    
                   char initalCharacter = str.charAt(i);
                   char nextCharacter = str.charAt(i+1);
                   
                   if(initalCharacter==nextCharacter){
                       return true;
                   }
                   
                    
                }
       
        return false;
       
       
       
       
       
       
    }
}