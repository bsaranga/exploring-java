package io.learntree.app;

import io.learntree.app.designPatterns.creational.factoryMethod.shape_factory_example.ShapeFactory;
import io.learntree.app.designPatterns.creational.factoryMethod.shape_factory_example.ShapeType;

public class App 
{
    public static void main( String[] args )
    {
        var circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();
    }
}
