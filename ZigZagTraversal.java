package versityworktask4;

public class ZigZagTraversal {
    public static void zigzagTraverse(int [][] array) {
        int rows = array.length;
        int cols = array[0].length;
        
        for(int i = 0; i < rows; i++){
            if(i % 2 == 0 ){
                
                // Left to right for even rows
                for( int j  = 0; j < cols; j++){
                    System.out.print(array [i][j] +" ");
                }
                
            } else {
                
                // Right to left for odd rows
                for(int j = cols - 1;j >= 0; j--){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        int [][]array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        zigzagTraverse(array);
    }
    
}
