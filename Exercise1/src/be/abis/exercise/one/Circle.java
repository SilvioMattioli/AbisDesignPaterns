package be.abis.exercise.one;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return 2.0;
    }

    @Override
    protected String color() {
        return super.color;
    }

    private double getRadius(){
        return 2.0;
    }
}
