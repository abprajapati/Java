
import java.util.Scanner;
// abstract class
abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    GeometricObject()
    {

    }
    // declaring parameterized constructor
    protected GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    // setters and getters ot access private member
    public String getColor()
    {
        return color;
    }
    public boolean getFilled()
    {
        return filled;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    // abstract methods
    abstract double getArea();

    abstract double getPerimeter();

}

class Triangle extends GeometricObject {

    double side1 , side2, side3;
    Triangle()
    {

        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    // parameterized constructor
    Triangle(double side1 ,double side2, double side3, String triColor, boolean triFilled)
    {
        // calling constructor of parent class using super keyword
        super(triColor, triFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public double getSide3()
    {
        return side3;
    }
    // full defination of abstract methods
    public double getArea()
    {
        double record = (side1 + side2 + side3)/2;
        double triArea;
        triArea = record*((record) - side1)*((record) - side2)*((record)- side3);
        triArea = Math.pow(triArea, 0.5);
        return triArea;
    }
    public double getPerimeter()
    {
        double periTriangle;
        periTriangle = (side1+side2+ side3)/2;

        return periTriangle;
    }
    public String toString()
    {
        return "\nArea of Triangle: "+ this.getArea() + "\nPerimeter of Triangle: " + this.getPerimeter() + "\nColor of Triangle: " + this.getColor() + "\nTriangle is filled: " + this.getFilled() ;
    }
}
public class Test
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the first side of triangle: ");
        double firstSide = sc.nextDouble();
        System.out.printf("Enter the second side of triangle: ");
        double secondSide = sc.nextDouble();
        System.out.printf("Enter the third side of triangle: ");
        double thirdSide = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Enter the color of the triangle:");
        String color = sc.nextLine();
        System.out.printf("Enter the indicator: ");
        boolean triFilled = sc.nextBoolean();


        Triangle obj = new Triangle(firstSide, secondSide, thirdSide, color, triFilled);
        System.out.printf("\nSides of the triangles side1: %.2f, side2: %.2f, side3: %.2f.\n", obj.getSide1(), obj.getSide2(), obj.getSide3());
        System.out.println(obj);

    }





}
