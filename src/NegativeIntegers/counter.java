package NegativeIntegers;

public class counter {
	
	private static int[][] Matrix;

	private static int negatives = 0;
	
	public static void main(String[] args){
		
		
		Matrix = new int[1][2]; // Adding Matrix dimensions
		
		int cols = Matrix.length; //gets initial length of Matrix
		int rows = Matrix[0].length;// gets length of the 2nd array, in this case the rows of the Matrix
		
		for(int i = 0; i < cols; i++){ 
			
			for (int j = 0;j < rows; j++){
				Matrix[i][j] = 70 - (int)(Math.random() * 100);	//Random initialisation of Matrix positions
				System.out.print(Matrix[i][j] + " "); //Printing out matrix
			}
			System.out.println();
		}	
	
		for(int i = 0; i < cols; i++){
			for (int j = 0;j < rows; j++){
				if(Matrix[i][j] < 0){
					negatives++; //looping through array to check for negative values
				}
			
			}
			}
		
		System.out.println("\nNo. of negative integers in matrix: " + negatives); // Printing out number of negative integers found
		
	}

}
