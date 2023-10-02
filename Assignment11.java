package jsd3;

public class Assignment11  {

    public static double areaOfRectangle(double length, double width){
        return length * width;
    }

    public static double perimeterOfRectangle(double length, double width){
        return 2 * (length + width);
    }
    public static void main(String[] args) {
        // Initializing length and width
        double length = 10;
        double width = 7;

        // Calculating Perimeter & Area
        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Perimeter of a Rectangle " + perimeter);
        System.out.println("Area of a Rectangle " + area);


        System.out.println("Area of a Rectangle from static method "+areaOfRectangle(length, width));
        System.out.println("Perimeter of a Rectangle from static method " +perimeterOfRectangle(length, width));
    }
}