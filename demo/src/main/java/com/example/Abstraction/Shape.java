package com.example.Abstraction;

public abstract class Shape {
    
    private String color;

    public Shape(String color) {
        super();
        this.color = color;
    }

    abstract double getArea();
    
    public abstract String toString();
    
    protected String getColor() {
        return this.color;
    };
}
