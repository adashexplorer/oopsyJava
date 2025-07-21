package com.adash.explorer.oopsyjava.abstraction;


abstract class Shape {

    String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
        System.out.println("Inside Shape class args constructor...");
    }

    abstract double area();

    public abstract String toString();

    public String getColor() {
        return color;
    }

}

class Circle extends Shape {

    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called...");
        this.radius = radius;
    }

    @Override double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString() {
        return "Circle color is : " + super.getColor() + "\n" +
                "area is : " + area();
    }

}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width) {
        super(color);
        System.out.println("Rectangle constructor called...");
        this.length = length;
        this.width = width;
    }

    @Override double area() {
        return length * width;
    }

    @Override public String toString() {
        return "Rectangle color is : " + super.getColor() + "\n" +
               "area is : " + area();
    }
}


public class GeometricalShapeUseCase {

    public static void main(String[] args) {

        Shape circle = new Circle("Red", 3.5d);
        Shape rectangle = new Rectangle("Blue", 10, 20);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());

    }
}
