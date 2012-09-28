public class Problem14 {

	public static void main(String[] args) {

		// n/2 if even
		// 3n+1 if odd
		int highNum = 0;
		int greatestCounter = 0;
		
		
		
		
		
		for (int i = 2; i < 14; i++) {
			boolean end = false;
			int counter = 0;
	
			int start = i;
			
			while (true) {
				int num = 0;
		
				
				if (start % 2 == 0) {
					num = i / 2;
					counter++;
		
					
				}
				else if ((start % 2) != 0){
					num = (i*3) + 1;
					counter++;
				}
			
				
				if (num == 1){
					break;
				}
		
				start = num;
				
		
				
				
			}
			
			
			if (counter > greatestCounter){
				highNum = i;
				greatestCounter = counter;
			}
			
			
			
			
			
		}//end of for loop

		
		System.out.println(highNum);
		
		
		
		
		
	}

}
