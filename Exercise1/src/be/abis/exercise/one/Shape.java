package be.abis.exercise.one;

abstract class Shape {
    protected final String color;

    protected Shape(String color) {
        this.color = color;
    }

    protected abstract double getArea();

    protected abstract String color();
}
