
public class Problem10 {

// Calculate all prime numbers below 2 000 000.
	
	public static void main(String[] args) {
	
		
		
		long counter = 0;
		long primeNumber = 0;

			for(long i = 1; i < 2000000; i++){
				long counter1 = 0;
				for(long j = 1; j<i; j++){
					if (i % j == 0)
						counter1++;
					if (counter1 > 1)
						break;
			
				}
				if (counter1 == 1){
					primeNumber = i + primeNumber;
					counter++;
				}
		
			}
			System.out.println(primeNumber);
			
	}
	


}
