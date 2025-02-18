
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to input: ");
        int size = input.nextInt();

        // One Dimensional Array with double values
        double[] myArray = new double[size];


        // Multidimensional Array
        int[][] secondArray = new int[3][3]; // 3 Rows and 3 Columns

        // Example of a multidimensional Array without allocating the memory and assigning the data
        int marks[][]={
                {80,45,23,12,23},
                {56,23,12,34,65},
                {67,89,90,45,23}};

        // Accessing  the data of a multidimensional Array
        for( int i = 0; i<marks.length; i++){   // this loop is used for the number of rows
            for (int j = 0; j < marks[i].length; j++){    //This loop is used for the number of columns
                System.out.print(marks[i][j] + "\t");    // Prints the value
            }
        }
        System.out.println();
        System.out.println("_______________________________________________________________________________");

        // Alternate way of printing the Values on this (Marks) Multidimensional Array
        for(int[] row: marks){
            for(int value: row ){
                System.out.print(value + "\t");
            }
        }


    }
}
