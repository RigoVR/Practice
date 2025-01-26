import java.util.Scanner;


public class forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many times would you like to loop your message? : ");
        int numOfLoops = input.nextInt();
            for ( int i = 1; i <= numOfLoops; i++){
            System.out.println(i + ": This is a for loop");
        }
    }
}
