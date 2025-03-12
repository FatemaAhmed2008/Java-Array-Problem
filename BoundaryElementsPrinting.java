package versityworktask4;

public class BoundaryElementsPrinting {
    public static void main(String[] args) {
        
        // Sample 2D array
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        // Print top row
        for(int j = 0;j < arr[0].length;j++){
            System.out.print(arr[0][j]+" ");
        }
        
        // Print right column(excluding first element)
        for(int i= 1;i < arr.length - 1 ;i++){
            System.out.print(arr[i][arr[i].length - 1]+" ");
        }
        
        // Print bottom row (if not the same as top row)
        if(arr.length > 1){
            for(int j = arr[arr.length -1 ].length - 1; j>= 0;j--){
                System.out.println(arr[arr.length - 1 ][j]+" ");
            }
        }
        
        // Print left column(excluding first and last element)
        if (arr[0].length > 1){
            for(int i = arr.length - 2;i > 0;i--){
                System.out.print(arr[i][0]+" ");
            }
        }
    }
    
}
