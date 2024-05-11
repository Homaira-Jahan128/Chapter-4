public class PropertiesOfPaper {
    public static void main(String[] args){
        double width = Constant.WIDTH * Constant.INCH_TO_MILLIMETER;
        double height = Constant.HEIGHT * Constant.INCH_TO_MILLIMETER;
        double perimeter = 2 * ( width + height );
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.printf("Width : %.3f millimeter\n", width);
        System.out.printf("Height : %.3f millimeter\n", height);
        System.out.printf("perimeter : %.3f millimeter\n",perimeter);
        System.out.printf("Diagonal : %.3f millimeter\n",diagonal);

    }
}
