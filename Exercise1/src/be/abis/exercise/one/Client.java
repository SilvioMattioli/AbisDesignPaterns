package be.abis.exercise.one;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        ArrayList<Shape> Shapes = new ArrayList<>();

        Shapes.add(new Rectangle("blue",3.0,5.0));
        Shapes.add(new Rectangle("red",6.0,5.0));
        Shapes.add(new Rectangle("green",7.0,5.0));

        Shapes.add(new Circle("purple",50.6));
        Shapes.add(new Circle("yellow",25.5));
        Shapes.add(new Circle("white",10.6));

        Shapes.stream().filter(shape -> shape.getClass().equals(Rectangle.class)).forEach(shape -> System.out.println(shape.getArea() +" "+ shape.getColor() +" "+ ((Rectangle) shape).getHeight() +" "+ ((Rectangle) shape).getWidth()) );
        Shapes.stream().filter(shape -> shape.getClass().equals(Circle.class)).forEach(shape -> System.out.println(shape.getArea() +" "+ shape.getColor() +" "+ ((Circle) shape).getRadius()));

    }
}
