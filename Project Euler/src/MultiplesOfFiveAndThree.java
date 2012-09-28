
public class MultiplesOfFiveAndThree {

	

	
	public static void main(String[] args) {

		 double number = 0;
		 double sum = 0;

	
	while (number != 1000){
		
	
		
		if (number%3==0 || number%5==0){
			sum += number;

		}
		number++;

		
		
	}
		
	System.out.println(sum);
	
	
		
		
	}
	
	
}


