package io.learntree.app.designPatterns.creational.factoryMethod.shape_factory_example;

public class Triangle implements Shape{

    private double sideLength;

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Drawing triangle with side-length: %s", sideLength));        
    }
    
}
