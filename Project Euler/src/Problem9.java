
public class Problem9 {
	
	/*There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
	 * 
	 */

	public static void main(String[] args) {

		double a = 1;
		double b = 2;
		double c = 0;
		double sum = 0;
		double product = 0;
		
		/*
		double a1= a * a;
		 double b1 = b * b;
		 c = (int) Math.sqrt(a1*b1);
		  
		 if(a<b && b<c){
			 sum = a+b+c;
		 }


		System.out.println("sum: " +sum);
		System.out.println(c);
			
		*/
		
			
			for(double i= 1; i<1000;i++){
				double check = 0;
				for(double j = 2; j<1000; j++){
					double i1 = i * i;
					double j1 = j * j;
					c =   Math.sqrt(i1+j1);
					if (j<c && i<c && i<j){
						
						 check = i+j+c;
					}
					if (check == 1000){
					System.out.println("I: " +i +" J: " +j +" C: "+c +" Check: "+check);
					product = i*j*c;

					System.out.println(product);
					}
						
				}


			}
		
	


		
		
	}
	
}
