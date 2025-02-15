public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
    
        // Use a switch statement to check for each vowel, both lowercase and uppercase
       
        char lowercase=ch;
        char uppercase= Character.toUpperCase(lowercase);
        
        
        switch (uppercase) {
            case 'A' :return true;
             
            case 'E' : return true;
        
            case 'I': return true;
         
            case 'O' : return true;
            
            case 'U' : return true;
           
        
            default:return false;
        }

        
    }
}