package com.awbp;

public final class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус круга должен быть больше нуля.");
        }

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
