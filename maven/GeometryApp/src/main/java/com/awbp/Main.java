package com.awbp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(5, 5);

        System.out.println("Периметр круга: " + circle.calculatePerimeter());
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

    }
}