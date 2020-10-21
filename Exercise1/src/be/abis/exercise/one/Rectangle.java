package be.abis.exercise.one;

public class Rectangle extends Shape {

    private final double height;

    private final double width;

    public Rectangle(String color,double height, double width) {
        super.setColor(color);
        this.height = height;
        this.width = width;
    }

    @Override
    protected double getArea() {
        return (height * width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}

