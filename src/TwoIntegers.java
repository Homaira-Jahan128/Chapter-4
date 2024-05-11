import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int firstInteger = Input.nextInt();
        int secondInteger = Input.nextInt();

        int sum = firstInteger + secondInteger;
        int difference =firstInteger - secondInteger;
        int product = firstInteger * secondInteger;
        double average = sum / 2.0;
        int distance = Math.abs(firstInteger - secondInteger);
        int max = Math.max(firstInteger, secondInteger);
        int min = Math.min(firstInteger, secondInteger);

        System.out.printf("Sum : %d\n", sum);
        System.out.printf("Difference : %d\n", difference);
        System.out.printf("Product : %d\n", product);
        System.out.printf("Average : %.2f\n", average);
        System.out.printf("Distance : %d\n", distance);
        System.out.printf("Maximum : %d\n", max);
        System.out.printf("Minimum : %d\n", min);


    }
}
