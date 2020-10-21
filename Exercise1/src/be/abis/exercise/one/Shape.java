package be.abis.exercise.one;

abstract class Shape {
    private String color;

    protected Shape() {
    }

    protected abstract double getArea();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
