package com.awbp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle(5, 5);

        System.out.println("Периметр круга: " + GeometryUtils.round(circle.calculatePerimeter(), 2));
        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        Sphere sphere = new Sphere(5);
        Pyramid pyramid = new Pyramid(10, 5);
        Parallepiped parallepiped = new Parallepiped(5, 5, 5);

        System.out.println("Объем сферы: " + GeometryUtils.round(sphere.calculateVolume(), 2));
        System.out.println("Площадь поверхности сферы: " + GeometryUtils.round(sphere.calculateSurfaceArea(), 2));
        System.out.println("Объем пирамиды: " + GeometryUtils.round(pyramid.calculateVolume(), 2));
        System.out.println("Площадь поверхности пирамиды: " + GeometryUtils.round(pyramid.calculateSurfaceArea(), 2));
        System.out.println("Объем параллелепипеда: " + parallepiped.calculateVolume());
        System.out.println("Площадь поверхности параллелепипеда: " + parallepiped.calculateSurfaceArea());

    }
}