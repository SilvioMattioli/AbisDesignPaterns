package be.abis.exercise.one;

public class Circle extends Shape {

    private final double radius;

    public Circle(String color, double radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius(){
        return radius;
    }
}
