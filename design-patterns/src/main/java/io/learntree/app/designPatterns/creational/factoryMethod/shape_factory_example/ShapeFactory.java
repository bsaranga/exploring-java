package io.learntree.app.designPatterns.creational.factoryMethod.shape_factory_example;

public class ShapeFactory {
    
    public static Shape createShape(ShapeType shapeType) {
        
        switch (shapeType) {
            case CIRCLE:
                return new Circle(0);
            case RECTANGLE:
                return new Rectangle(0, 0);
            case TRIANGLE:
                return new Triangle(0);
        }

        return null;
    }
}
