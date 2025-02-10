package primitivedatatypes;

public class MYCHAR {
  
	 private char ch1;
	
	
	public MYCHAR(char c) {
		this.ch1=c;
	}
	
	
	Boolean isdigit() {
		
		if(ch1>=49 && ch1<=57) {
			return true;
		}
		
		return false;
		
		
	}
	
	Boolean isvowel() {
		
		if(ch1=='a'|| ch1=='A')
			return true;
		if(ch1=='e' || ch1=='E')
			return true;
		if(ch1=='i' || ch1=='I')
			return true;
		if(ch1=='o' || ch1=='O')
			return true;
		if(ch1=='u' || ch1=='U')
			return true;
		
		return false;
	}
	
	Boolean isAlbhapet() {
		
	if(ch1>=97 && ch1<=122) {
		return true;
	}
		return false;
		
	}
	
	Boolean Consonent() {
		// alphabets ! vowels
		
		if(isAlbhapet() && !isvowel()) {
			return true;
		}
		
		return false;
		
	}


	public static void printLowerCaseAlphabets() {
		// print 'a to 'z'
		
		for(char ch='a'; ch<='z';ch++) {
			System.out.println(ch);
		}
	}


	public static void printupperCaseAlphabets() {
		// print 'A' to 'Z'
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
		}
		
	}
	
	
	

}
