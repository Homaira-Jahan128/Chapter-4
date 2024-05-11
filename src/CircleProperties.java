import java.util.Scanner;

public class CircleProperties {
        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);
            System.out.print("Enter radius of a circle : ");
            double radius = Input.nextDouble();


            double area = Math.PI * radius;
            double circleCircumference =  2 * Math.PI * radius;
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            double surfaceArea = 3.0 * Math.PI * Math.pow(radius, 2);

            System.out.printf("Area : %.3f\n",area);
            System.out.printf("Circle Circumference : %.3f\n", circleCircumference);
            System.out.printf("Volume : %.3f\n ", volume);
            System.out.printf("Surface Area : %.3f\n ", surfaceArea);


        }
}
