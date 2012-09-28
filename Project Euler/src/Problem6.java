
public class Problem6 {
	
	
	/*
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

	 */

	public static void main(String[] args){
        long t0 = System.currentTimeMillis();
		long smallNum = 0 ;
		
		for(long i = 1; i < Long.MAX_VALUE; i++){
			long counter = 0;
				for(long j = 1; j<21; j++){
		
					if (i % j == 0){
						counter++;
					}
					else{
						break;
					}
					

				}
				
				if (counter == 20){
					smallNum = i;
					break;
		}
	}
		
		System.out.println(smallNum);
        long t1 = System.currentTimeMillis();
        double elapsedTimeSeconds = (t1 - t0)/1000.0;
		
        System.out.println("MethodTook: " + elapsedTimeSeconds + " s");
	}
}

	
	
	
	
