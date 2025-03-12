package versityworktask4;

public class MatrixAddition {
    public static void main(String[] args) {
        
        // Define Matrices
        int[][]matrix1 = {
            {1, 2},
            {3, 4}
                
        };
        
        int[][]matrix2 = {
            {5, 6},
            {7, 8}
                
        };
        
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        // Add the two matrices
        for(int i = 0;i < rows;i++){
            
            for (int j = 0; j < cols;j++ ){
                
                result[i][j] = matrix1 [i][j] + matrix2[i][j];
        }
    }
    // Display the result
    System.out.println("Resultant Matrix:");
    
    for(int i = 0; i < rows;i++){
    
    for(int j = 0; j < cols;j++){
        
        System.out.print(result[i][j]+" ");
        
             }
            System.out.println();
      }
   } 
    
}
