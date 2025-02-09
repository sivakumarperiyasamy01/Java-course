package primitivedatatypes;

import java.math.BigDecimal;

public class Calculator {
	
	BigDecimal principle;
	BigDecimal interst;
	
	
	Calculator(String principle, String interst){
		
		this.principle= new BigDecimal(principle);
		this.interst= new BigDecimal(interst).divide(new BigDecimal(100));
		
		
	}
	
	BigDecimal CalculateTotalValue(int noOfYears) {
		
		// simples interst=principle + principle*interst*noofyears
		
		BigDecimal years= new BigDecimal(noOfYears);
		
		BigDecimal sum= principle.add(principle.multiply(interst).multiply(years));
		
		return sum;
	}
	
	
}
