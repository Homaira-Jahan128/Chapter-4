import java.util.Scanner;

public class ParameterChange {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter measurement : ");
        int measurement = Input.nextInt();

        double intoMiles = measurement * Constant.METER_TO_MILE;
        double intoFeet = measurement * Constant.METER_TO_FEET;
        double intoInch = measurement * Constant.METER_TO_INCH;

        System.out.println("Measurement into miles : " + intoMiles);
        System.out.println("Measurement into feet : " + intoFeet);
        System.out.println("Measurement into inch : " + intoInch);


    }
}
