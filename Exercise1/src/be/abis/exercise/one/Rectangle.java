package be.abis.exercise.one;

public class Rectangle extends Shape {

    private final double height;

    private final double width;

    protected Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }


    @Override
    protected double getArea() {
        return (height + width) * 2;
    }

    @Override
    protected String color() {
        return super.color ;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

