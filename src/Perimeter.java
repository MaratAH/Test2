public class Perimeter {

    public static void main(String[] args) {
        int side = 2;
        int base = 1;
        int edge = 4;
        System.out.println("Периметр треугольника " + getPerimeterTriangle(8, 5));
        System.out.println("Периметр окружности " + getPerimeterCircle(10));
    }


    public static int getPerimeterTriangle(int a, int b) {
        int perimeterTriangle = (2 * a) + b;

        return perimeterTriangle;
    }

    public static int getPerimeterSquare(int a) {
        int perimeterSquare = 4 * a;

        return perimeterSquare;
    }

    public static double getPerimeterCircle(int radius) {
        double pi = 3.14d;
        double perimeterCircle = 2 * pi * radius;

        return perimeterCircle;
    }


}
