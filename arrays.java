
import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to input: ");
        int size = input.nextInt();

        double[] myArray = new double[size];

        for(int i = 0; i < myArray.length; i++){
            System.out.print("Enter Value " + (i+1) + ": ");
            myArray[i] = input.nextDouble();
        }

        double total = 0;

        for(int i = 0; i < myArray.length; i++ ){
            total = total + myArray[i];
        }


        System.out.println("The Total is : " + total);





    }
}
