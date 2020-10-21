package be.abis.exercise.one;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle("blue", new Point(), 3.0, 5.0));
        shapes.add(new Rectangle("red", new Point(), 6.0, 5.0));
        shapes.add(new Rectangle("green", new Point(), 7.0, 5.0));

        shapes.add(new Circle("purple", new Point(), 50.6));
        shapes.add(new Circle("yellow", new Point(), 25.5));
        shapes.add(new Circle("white", new Point(), 10.6));

        shapes.forEach(shape -> System.out.println("color: " + shape.getColor() + " and the area is:  " + shape.area() + " and measurements are: " + shape.toString()));


    }
}
