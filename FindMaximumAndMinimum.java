package versityworktask4;

public class FindMaximumAndMinimum {
    public static void main(String[] args) {
        
        //2D array with the values 
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        
        // Initializing the smallest and largest elements
        int smallest = arr[0][0];
        int largest = arr[0][0];
        
        // Loop through the 2D array to find the smallest and largest elements
        for(int i = 0; i < arr.length;i++){
            
            for( int j = 0; j < arr[i].length;j++){
                
                if(arr[i][j] < smallest){
                    smallest = arr[i][j];
                }
                
                if (arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }
        
    // Output the result
    System.out.println("Smallest element in the 2D array:"+ smallest);    
    System.out.println("Largest element in the 2D array:" + largest);
    
   }
}