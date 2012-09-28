
public class Problem5 {
	
	
	/*
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

	public static void main(String[] args){
		
		long sumOfSquares = 0;
	
		
		for(long i = 1; i < 100; i++){
			long squared = (long) Math.pow(i, 2);
			sumOfSquares = squared + sumOfSquares;
		}
		
		
	System.out.println(sumOfSquares);
	
		
	
	long squareOfSum = 0;
	long total = 0;

	
		for (long i = 1; i < 100; i++){
			total = i + total;
		}
		
		squareOfSum = (long) Math.pow(total, 2);
		
		System.out.println(squareOfSum);
		
		long difference =  squareOfSum - sumOfSquares;
		System.out.println(difference);
		
		
		
	}
	
	
}
