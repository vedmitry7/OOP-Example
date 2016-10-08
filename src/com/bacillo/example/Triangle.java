package com.bacillo.example;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    protected double getPerimeter(){
        return (a + b + c);
    }

    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt( p * (p-a) * (p-b) * (p-c));
    }
}
