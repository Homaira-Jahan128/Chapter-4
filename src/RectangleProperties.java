import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter length : ");
        double height = Input.nextDouble();
        System.out.print("Enter width : ");
        double width = Input.nextDouble();

        double area = height * width;
        double perimeter = (height + width) * 2;
        double diagonal = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        System.out.printf("Area : %.3f\n",area);
        System.out.printf("Perimeter : %.3f\n", perimeter);
        System.out.printf("Diagonal : %.3f\n ", diagonal);

    }
}
