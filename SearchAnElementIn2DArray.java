package versityworktask4;
import java.util.Scanner;

public class SearchAnElementIn2DArray {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        
        // Define the 2D array
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11,12}
        };
        
        // Get the number to search from the user
        System.out.print("Enter the number :");
        int number = Scanner.nextInt();
        
        //Search for the number
        for(int i = 0;i < array.length;i++){
            
            for(int j =0;j < array[i].length;j++){
                
                if (array[i][j]== number){
                    System.out.println("Number"+ number+" found at position ("+i+","+j+")");
                    Scanner.close();
                    
                    return;// Exit the method once the number is found
                }
            }
        }
        
        // If not found
        System.out.println("Number"+number+"not found in the array:");
        Scanner.close();
                  
    }
    
}
