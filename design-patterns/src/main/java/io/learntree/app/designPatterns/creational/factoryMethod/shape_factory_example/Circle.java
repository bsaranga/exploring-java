package io.learntree.app.designPatterns.creational.factoryMethod.shape_factory_example;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing circle with radius %s", radius));
    }
    
}
