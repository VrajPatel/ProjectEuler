import java.math.BigInteger;


public class Problem3Temp {

	

	
	public static void main(String[] args) {
		
		//BigInteger startNumber = new BigInteger("600851475143");
		BigInteger startNumber = new BigInteger("36");
		BigInteger number = new BigInteger("1");
		BigInteger biggestNum = new BigInteger("1");
		BigInteger temp = new BigInteger("1");

		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger ("1");
		BigInteger negativeOne = new BigInteger("-1");
		
		
		
		
		
		
		
		
		


		while (number.compareTo(startNumber) == -1){
			
			BigInteger remainder = startNumber.remainder(number);
			
			//checking for prime
			BigInteger checker = new BigInteger("1");
			int counter = 0;
			
			if (remainder.compareTo(zero) == 0 && number.compareTo(biggestNum) == 1){
				
				temp = number;
				
				
				
				
				
			}
			
			//checking for prime

			while (checker.compareTo(temp) == -1){

				
				BigInteger remainderTwo = temp.remainder(checker);
				if (remainderTwo.compareTo(zero) == 0){
					counter++;
					
				}
				
				
				checker = checker.add(one);
			}
			
			if(counter == 1){
				biggestNum = temp;
			}
	
			


			
			number = number.add(one);
			

		}
		
		System.out.println(biggestNum);
		


		
		
		
	}
	
	
	
	
	
	
	
	
	
}
