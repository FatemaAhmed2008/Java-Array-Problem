package versityworktask4;

public class CheckIdentityMatrix {
    public static boolean isIdentityMatrix(int[][] matrix) {
        int n = matrix.length;
        
        // Check if the matrix is square and identity matrix conditions
        for (int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == j && matrix[i][j]!=1){
                    return false;
                
                }
            }
        }
        return true;
        
    }
    public static void main(String[]args){
        int [][]matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        
        if(isIdentityMatrix(matrix)){
            System.out.println("The matrix is an identity matrix:");
            
        }else{
            System.out.println("The matrix is not an identity matrix:");
        }
    }
    
}
