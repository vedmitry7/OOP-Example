package com.bacillo.example;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4);
        Circle circle = new Circle(15);
        Bagel bagel = new Bagel(25, 10);

        printArea(triangle);
        printArea(circle);
        printArea(bagel);
    }

    static void printArea(Shape shape){
        System.out.println(shape.getArea());
    }
}
