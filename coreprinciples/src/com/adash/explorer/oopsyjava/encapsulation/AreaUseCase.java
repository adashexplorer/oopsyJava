package com.adash.explorer.oopsyjava.encapsulation;

class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        System.out.println("Inside Rectangle class default constructor");
    }

    public Rectangle(double length, double width) {
        System.out.println("Inside Rectangle class args constructor");
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}


public class AreaUseCase {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.0d, 20.0d);
        System.out.println(rectangle.getArea());
    }
}
