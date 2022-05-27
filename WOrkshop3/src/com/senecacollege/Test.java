package com.senecacollege;


import java.util.Scanner;

abstract class GeometricObject{
    private String color = "white";
    private boolean filled;
    GeometricObject()
    {

    }
    protected GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;

    }
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
    abstract double getArea();

    abstract double getPerimeter();

}

class Triangle extends GeometricObject {

    double side1 = 1.0, side2 = 1.0, side3 = 1.0;
    Triangle()
    {

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
}
public class Test
{
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter the first side off triangle");
    double firstSide = sc.nextDouble();
    System.out.println("Enter the second side of triangle");
    double secondSide = sc.nextDouble();
     System.out.println("Enter the third side of triangle")
    double thirdSide = sc.nextDouble();





}

