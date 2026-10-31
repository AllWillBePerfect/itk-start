package com.awbp;

public class Parallepiped implements Shape3D {
    private final double length;
    private final double width;
    private final double height;

    public Parallepiped(double length, double width, double height) {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Все измерения параллелепипеда должны быть > 0");
        }

        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public double calculateSurfaceArea() {
        double frontAndBack = length * width;
        double sideAndSide = width * height;
        double topAndBottom = length * height;
        return 2.0 * (frontAndBack + sideAndSide + topAndBottom);
    }

}