package NegativeIntegers;

public class counter {
	
	private static int[][] Matrix;

	private static int negatives = 0;
	
	public static void main(String[] args){
		
		
		Matrix = new int[10][15]; // Adding Matrix dimensions
		
		int cols = Matrix[0].length; //gets initial length of Matrix
		int rows = Matrix.length;// gets length of the 2nd array, in this case the rows of the Matrix
		
		for(int i = 0; i < rows; i++){ 
			
			for (int j = 0;j < cols; j++){
				Matrix[i][j] = 70 - (int)(Math.random() * 100);	//Random initialisation of Matrix positions
				System.out.print(Matrix[i][j] + " "); //Printing out matrix
			}
			System.out.println();
		}	
	
		for(int i = 0; i < rows; i++){
			for (int j = 0;j < cols; j++){
				if(Matrix[i][j] < 0){
					negatives++; //looping through array to check for negative values
				}
			
			}
			}
		
		System.out.println("\nNo. of negative integers in matrix: " + negatives); // Printing out number of negative integers found
		
	}

}
