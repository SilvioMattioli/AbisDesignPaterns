package be.abis.exercise.one;

abstract class Shape {
    protected String color;
    protected Point origin;

    public Shape(String color, Point origin) {
        this.color = color;
        this.origin = origin;
    }

    protected String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    protected abstract double area();
}
