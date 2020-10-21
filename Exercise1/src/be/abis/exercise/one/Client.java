package be.abis.exercise.one;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();

        rectangles.add(new Rectangle("blue",3.0,5.0));
        rectangles.add(new Rectangle("red",6.0,5.0));
        rectangles.add(new Rectangle("green",7.0,5.0));

        circles.add(new Circle("purple",50.6));
        circles.add(new Circle("yellow",50.6));
        circles.add(new Circle("white",50.6));

        rectangles.forEach(shape -> System.out.println(shape.getArea() +" "+ shape.color +" "+ shape.getWidth()));
        circles.forEach(circle -> System.out.println(circle.getArea() + "" +circle.color));
    }
}
