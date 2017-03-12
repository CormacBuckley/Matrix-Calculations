package MatrixMultiplication;

public class multiplication {
	
	private static int cols1;
	private static int rows1;
	private static int cols2;
	private static int rows2;
	
	private static int[][] product;
	
	public static void main(String[] args){
		int[][] Matrix1 = new int[4][3];
		int[][] Matrix2 = new int[3][1];
		
		 cols1 = Matrix1[0].length;
		 rows1 = Matrix1.length;
		
		 cols2 = Matrix2[0].length;
		 rows2 = Matrix2.length;
		 
		 
		 System.out.println("A: ");
			for(int i = 0; i < rows1; i++){ 
				for (int j = 0;j < cols1; j++){
					Matrix1[i][j] = (int)(Math.random() * 10);	//Random initialisation of Matrix positions
					System.out.print(Matrix1[i][j] + " "); //Printing out matrix
				}
				System.out.println();
				
			}				
			System.out.println();
			
			 System.out.println("B: ");
			for(int i = 0; i < rows2; i++){ 
				for (int j = 0;j < cols2; j++){
					Matrix2[i][j] = (int)(Math.random() * 10);	//Random initialisation of Matrix positions
					System.out.print(Matrix2[i][j] + " "); //Printing out matrix
				}
				System.out.println();
			}	
		 
	/* multiply(Matrix1,Matrix2);
		 System.out.println();
		 
		 System.out.println("Product: ");
			
			for(int i = 0; i < rows1; i++){ 
				for (int j = 0;j < cols2; j++){
					System.out.print(product[i][j] + " "); //Printing out matrix
				}
				System.out.println();
			}	*/
		
		
	}

	private static int[][] multiply(int[][] A,int[][] B){
		product = new int[rows1][cols2];
		if(cols1==rows2){
			for(int x = 0; x < rows1;x++){
			for (int i = 0; i < cols2; i++){
			product[x][i] =	(A[x][i] * B[x][i]) +(A[x][i] * B[x][i]);
			}
			}
		}
		
		return product;
		
	}

}
