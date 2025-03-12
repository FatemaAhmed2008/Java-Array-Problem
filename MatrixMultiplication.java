package versityworktask4;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
        //Define the matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        
    };
        int[][]matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        
        // Get the dimensions
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        
        //Initialize the result matrix
        int[][]result = new int [rows1][cols2];
        
        // Multiply the matrices
        for(int i = 0;i < rows1;i++){
            
            for(int j = 0 ;j < cols2;j++){
                
                for(int k = 0;k < cols1; k++){
                    result[i][j]+= matrix1[i][k]*matrix2[k][j];
                    
                }
                
            }
        }
        //print the result matrix
        System.out.println("Result matrix:");
        
        for(int i = 0;i < rows1;i++){
            
            for(int j = 0;j < cols2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
