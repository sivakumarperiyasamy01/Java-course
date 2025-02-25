public class StringMagic {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        
      
      if(str==null){
          return 0;
      }
        
        
        
        
        int count=0;
        
        for(int i=0; i<str.length();i++) {
            
          char letter= str.charAt(i);
          
        if (Character.isUpperCase(letter)) {
           count++;
       }
          
            
    }
        
        return count;
    }
}