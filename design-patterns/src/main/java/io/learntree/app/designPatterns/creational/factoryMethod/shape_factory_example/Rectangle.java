package io.learntree.app.designPatterns.creational.factoryMethod.shape_factory_example;

public class Rectangle implements Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing rectangle with length: %s and width: %s", length, width));
    }
    
}
