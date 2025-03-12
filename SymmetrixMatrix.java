package versityworktask4;
import java.util.Scanner;

public class SymmetrixMatrix {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        // Input matrix dimensions
        System.out.print("Enter the number of rows:");
              int rows = Scanner.nextInt();
              System.out.print("Enter the number of columns:");
                int cols = Scanner.nextInt();
                
         // A symmetric matrix must be square
                if (rows!= cols){
        System.out.println("The matrix is not symmetric(it must be square).");                }
                int[][] matrix = new int[rows][cols];
                
        //Input matrix elements
        System.out.println("Enter the matrix elements:");
               for(int i = 0;i< rows;i++){
                   for(int j = 0;j < cols;j++){
                       matrix[i][j] = Scanner.nextInt();
                   }

                }
        // Check if the matrix is symmetric
          if (issymmetric(matrix,rows)){
              System.out.println("The matrix is symmetric:");
              
                 }else{
            System.out.println("The matrix is not symmetric:");
            
                }
          
        Scanner.close();
    }
        
        // Function to the Check if a matrix is symmetric
             public static boolean
                     issymmetric(int[][] matrix, int n){
                         for(int i =0; i<n; i++){
                             for(int j = 0;j < n; j++){
                                 if(matrix[i][j]!= matrix[i][j]){
                                     return false;// If any element is not equal to its transpose counterpart,return false
                                     
                                 }
                               
                             }
                             
                         }
                          return true;
     
                 
                }
            }
            

        
     
    
    

