public class Problem12 {

	public static void main(String[] args) {
		long t0 = System.currentTimeMillis();

		int triangleNumber[] = new int[100000000];

		triangleNumber[0] = 1;

		for (int i = 1; i < triangleNumber.length; i++) {

			triangleNumber[i] = triangleNumber[(i - 1)] + (i + 1);

		}
		
		

		for (int i = 1; i < triangleNumber.length; i++) {
			int counter = 0;
			int limit = triangleNumber[i];
			
			
			for (int j = 1; j < limit; j++) {

				if (triangleNumber[i] % j == 0) {
					limit = triangleNumber[i] / j;
					counter++;
				}
				

			}
			
			counter = counter * 2;
			
		
			if (counter > 500) {
				long t1 = System.currentTimeMillis();
				double elapsedTimeSeconds = (t1 - t0) / 1000.0;
				System.out.println("Execution time: " + elapsedTimeSeconds
						+ "s");
				System.out.println("Triangle Number: " + triangleNumber[i]);
				break;
			}

		}

	}

}
