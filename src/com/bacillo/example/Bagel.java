package com.bacillo.example;

public class Bagel extends Circle {

    private double innerRadius;

    public Bagel(double radius, double innerRadius ) {
        super(radius);
        this.innerRadius = innerRadius;
    }

    @Override
    public double getArea() {
        return super.getArea() - new Circle(innerRadius).getArea();
    }
}
