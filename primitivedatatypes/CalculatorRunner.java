package primitivedatatypes;

import java.math.BigDecimal;

public class CalculatorRunner {

	public static void main(String[] args) {
		
	Calculator simpleInterst= new Calculator("4500","7.5");

	BigDecimal Sum = simpleInterst.CalculateTotalValue(5);
	
	System.out.println(Sum);
	
			
			
	}

}
