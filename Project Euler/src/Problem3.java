import java.math.BigInteger;


public class Problem3 {

	
	/*
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
	 */
	

	
	public static void main(String[] args) {
		
		//BigInteger startNumber = new BigInteger("600851475143");
		BigInteger startNumber = new BigInteger("600851475143");
		BigInteger number = new BigInteger("2");
		BigInteger biggestNum = new BigInteger("2");
		BigInteger temp = new BigInteger("1");

		BigInteger zero = new BigInteger("0");
		BigInteger one = new BigInteger ("1");
		BigInteger negativeOne = new BigInteger("-1");
		
		/*
		System.out.println("Initial Values: " +"Current#: "+number  +" BiggestNumber: " +biggestNum);
		
		
		Boolean check1 = false;
		BigInteger remainder = startNumber.remainder(number);
		System.out.println("Remainder: " +remainder);
		if (remainder == zero){
			check1 = true;
		}
		
		System.out.println(check1);
		System.out.println(zero);
		
		if (startNumber.remainder(number) == zero && number.compareTo(biggestNum) == 1){
			
			biggestNum = number;
			
		}
		
		System.out.println("New Biggest Number: " +biggestNum);
		*/
		
		
		/*
		//Check
		BigInteger remainder = startNumber.remainder(number);
		System.out.println("Remainder: " +remainder);
		
		int compareTo = number.compareTo(biggestNum);
		
		System.out.println("Is it bigger? " +compareTo);
		
		biggestNum = number;
		
		System.out.println("New Biggest Number: " +biggestNum);
		*/

		
		

		while (number.compareTo(startNumber) == -1){
			
			BigInteger remainder = startNumber.remainder(number);
			
	
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
