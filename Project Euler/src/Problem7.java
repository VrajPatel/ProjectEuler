
public class Problem7 {
	public static void main(String[] args){
		
		// Find 10001st prime #;
        long t0 = System.currentTimeMillis();
		int counter = 0;
		int primeNumber = 0;

			for(int i = 1; i < Integer.MAX_VALUE; i++){
				int counter1 = 0;
				for(int j = 1; j<i; j++){
					if (i % j == 0)
						counter1++;
					if (counter1 > 1)
						break;
			
				}
				if (counter1 == 1){
					primeNumber = i;
					counter++;
				}
			
				if (counter == 10001)
					break;
			}
			
	        long t1 = System.currentTimeMillis();
	        double elapsedTimeSeconds = (t1 - t0)/1000.0;
	        System.out.println("MethodTook: " + elapsedTimeSeconds + " s");
		System.out.println(counter);	
		System.out.println(primeNumber);
		
		
		
		
	}
	
	
	
}
