package versityworktask4;

public class Print2DArray {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][]array = {
            {1 , 2, 3},
            {4 , 5, 6},
            {7 , 8, 9}
        };
        
        // Loop through each row
        for(int i= 0;i < array.length;i++){
            
        
        // Loop through each element of the row
        
        for(int j = 0; j < array[i].length;j++){
            
            
            //Print the element
            System.out.print(array[i][j]+" ");
            
        }
        // Move to the next line after each row
            System.out.println();
        }
    }     
    
}
