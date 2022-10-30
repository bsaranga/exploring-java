package com.example.Abstraction;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Circle: color -> %s, radius -> %s, area -> %s", super.getColor(), this.radius, this.getArea());
    }
    
}
