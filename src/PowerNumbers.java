import java.util.Scanner;

public class PowerNumbers {
   public static void main(String[] args){
       Scanner Input = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int number = Input.nextInt();

       int square = number * number;
       int cube = number * number * number;
       double fourth = Math.pow(number, 4);

       System.out.printf("Number : %d\nSquare : %d\ncube : %d\nFourth : %.0f\n", number, square, cube, fourth);


   }
}
