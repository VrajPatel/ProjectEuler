
public class Problem4 {

	/*
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	
	
	public static void main(String[] args) {
		
		int cap = 1000;
		int startOne = 100;
		int startTwo = 100;
		int counter = 0;
		int highNumber = 0;
		

			
			for(int i = 100; i < cap; i++){
				for(int j = 100; j < cap; j++){
					
					int temp = 0;
					int number = i * j;
					
					String numberString = Integer.toString(number);
					StringBuffer rev = new StringBuffer(numberString);
					rev = rev.reverse();
					numberString = rev.toString();
					int numberTwo = Integer.parseInt(numberString);
					
					if(number == numberTwo && number>highNumber){
						highNumber = number;
					}
					
					
					
					
				}
			}
			

			System.out.println(highNumber);
			
			
			
			
	}
		
		
		
		
}
	

