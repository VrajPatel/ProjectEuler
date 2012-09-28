
public class Problem11 {
	public static void main(String[] args) {
	
		// Find the greatest product of four adjacent numbers in any direction, up, down, left, right, or diagonally) in the 20x20 grid.
		int maxProduct = 0;
		int [] [] array = { {8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 0, 5, 07, 78, 52, 12, 50, 77, 91, 8},
						  {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
		                  {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
		                  {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
		                  {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
		                  {24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
		                  {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
		                  {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
		                  {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
		                  {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 00, 61, 33, 97, 34, 31, 33, 95},
		                  {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 04, 62, 16, 14, 9, 53, 56, 92},
		                  {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
		                  {86, 56, 0, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
		                  {19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
		                  {4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
		                  {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
		                  {4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
		                  {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
		                  {20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
		                  {1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48}};
		
		
		long t0 = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
			
				
				
			//horizontal-right
				
			if (j<16){	
			int numberOne = array[i][j];
			int numberTwo = array[i][j+1];
			int numberThree = array[i][j+2]; 
			int numberFour = array[i][j+3];
			
			int hold = numberOne *  numberTwo * numberThree * numberFour;
			
				if (hold > maxProduct){
					maxProduct = hold;
				}
			}
			
			//vertical-down
			if (i<16){
			int numberOne1 = array[i][j];
			int numberTwo1 = array[i+1][j];
			int numberThree1 = array[i+2][j]; 
			int numberFour1 = array[i+3][j];
		
			int hold1 = numberOne1 *  numberTwo1 * numberThree1 * numberFour1;
			
			if (hold1 > maxProduct){
				maxProduct = hold1;
			}
			
			}
			
			//diagonal-right-down
			if (i<16 && j<16){
			int numberOne2 = array[i][j];
			int numberTwo2 = array[i+1][j+1];
			int numberThree2 = array[i+2][j+2]; 
			int numberFour2 = array[i+3][j+3];
		
			int hold2 = numberOne2 *  numberTwo2 * numberThree2 * numberFour2;
			
				if (hold2 > maxProduct){
					maxProduct = hold2;
				}
			}
			
			//diagonal-left-down
			if(i<16 && j>2){
			int numberOne3 = array[i][j];
			int numberTwo3 = array[i+1][j-1];
			int numberThree3 = array[i+2][j-2]; 
			int numberFour3 = array[i+3][j-3];
		
			int hold3 = numberOne3 *  numberTwo3 * numberThree3 * numberFour3;
			
				if (hold3 > maxProduct){
					maxProduct = hold3;
				}
			}

			//horizontal-left
			if (j>2){
			int numberOne4 = array[i][j];
			int numberTwo4 = array[i][j-1];
			int numberThree4 = array[i][j-2]; 
			int numberFour4 = array[i][j-3];
		
			int hold4 = numberOne4 *  numberTwo4 * numberThree4 * numberFour4;
			
				if (hold4 > maxProduct){
					maxProduct = hold4;
				}
			}
			
			//vertical-up
			if(i>2){
			int numberOne5 = array[i][j];
			int numberTwo5 = array[i-1][j];
			int numberThree5 = array[i-2][j]; 
			int numberFour5 = array[i-3][j];
		
			int hold5 = numberOne5 *  numberTwo5 * numberThree5 * numberFour5;
			
				if (hold5 > maxProduct){
					maxProduct = hold5;
				}
			}
			
			//diagonal-left-up
			if(i>2 && j>2){
			int numberOne6 = array[i][j];
			int numberTwo6 = array[i-1][j-1];
			int numberThree6 = array[i-2][j-2]; 
			int numberFour6 = array[i-3][j-3];
		
			int hold6 = numberOne6 *  numberTwo6 * numberThree6 * numberFour6;
			
			if (hold6 > maxProduct){
				maxProduct = hold6;
			}
			}
			
			//diagonal-right-up
			if (i>2 && j<16){
			int numberOne7 = array[i][j];
			int numberTwo7 = array[i-1][j+1];
			int numberThree7 = array[i-2][j+2]; 
			int numberFour7 = array[i-3][j+3];
		
			int hold7 = numberOne7 *  numberTwo7 * numberThree7 * numberFour7;
			
				if (hold7 > maxProduct){
					maxProduct = hold7;
				}
			}
	
		}
			
	}
		
		long t1 = System.currentTimeMillis();
		double elapsedTimeSeconds = (t1 - t0)/1000.0;
		System.out.println("Execution time: " +elapsedTimeSeconds+"s");
		System.out.println("maxProduct: " +maxProduct);	
		
		
	}
	
}
