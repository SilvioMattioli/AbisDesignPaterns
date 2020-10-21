package be.abis.exercise.one;

public class Circle extends Shape {

    private double radius;

    public Circle(String color,Point point,double radius) {
        super(color,point);
        this.radius = radius;
    }

    @Override
    protected double area() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
