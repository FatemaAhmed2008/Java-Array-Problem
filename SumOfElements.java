package versityworktask4;

public class SumOfElements {
    public static void main(String[] args) {
        
        // Define a 2D array
        int[][]array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Initialize sum variable
        int sum = 0;
        
        // Loop through the 2D array to calculate the sum of elements
        for(int i = 0;i < array.length;i++){
            
        for(int j = 0;j <array[i].length;j++) {
            sum += array[i][j];
        }  
      }
        
        // Output the sum
        System.out.println("The sum of all elements in the 2D array is :" + sum);
    }
    
}
