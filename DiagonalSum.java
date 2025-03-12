package versityworktask4;

public class DiagonalSum {
    public static void main(String[] args) {
        
        // Define a square matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Get the size of a matrix
        int n = matrix.length;
        
        //Calculate the sum of the main diagonal and secondary diagonal
        int mainDiagonalSum = 0, secondaryDiagonalSum = 0;
        
        for(int i = 0; i<n;i++){
            
            // Main diagonal elements
            mainDiagonalSum +=matrix[i][i];
            
            // Secondary diagonal elements
            secondaryDiagonalSum +=matrix[i][n-i-1];
        }
        
        // Output the results
        System.out.println("sum of the main diagonal:"+ mainDiagonalSum);
        System.out.println("sum of the secondary diagonal:"+secondaryDiagonalSum);
        
    }
    
}
