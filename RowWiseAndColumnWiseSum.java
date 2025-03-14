package versityworktask4;

public class RowWiseAndColumnWiseSum {
    public static void main(String[] args) {
        
        // Initialize matrix 
        int matrix [][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Calaulate row sums
        System.out.println("Sum of each row:");
        
        for ( int i = 0;i < rows ;i++){
            int rowSum = 0;
            
            for(int j = 0;j < cols;j++){
                rowSum += matrix[i][j];
    
        }
            
        System.out.println("Row"+(i + 1)+":"+ rowSum);
        
    }
        
    //Calculate column sums
    System.out.println("\nSum of each column:");
    
    for(int j = 0;j<cols;j++){
        
    int colSum = 0;
    
    for(int i = 0;i<rows;i++){
        colSum += matrix[i][j];
        
    }
    
            System.out.println("Column"+(j +1 )+":"+colSum);
            
        }
        
    }
    
}