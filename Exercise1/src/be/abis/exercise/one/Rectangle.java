package be.abis.exercise.one;

public class Rectangle extends Shape {

    private final double height;

    private final double width;

    public Rectangle(String color, Point point, double height, double width) {
        super(color, point);
        this.height = height;
        this.width = width;
    }

    @Override
    protected double area() {
        return (height * width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}

