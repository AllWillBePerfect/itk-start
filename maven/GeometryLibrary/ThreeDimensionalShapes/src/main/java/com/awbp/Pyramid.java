package com.awbp;

public class Pyramid implements Shape3D {
    private final double baseSide;
    private final double height;

    public Pyramid(double baseSide, double height) {
        if (baseSide <= 0 || height <= 0) {
            throw new IllegalArgumentException("Размеры пирамиды должны быть > 0");
        }

        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * (baseSide * baseSide) * height;
    }

    @Override
    public double calculateSurfaceArea() {
        double baseArea = baseSide * baseSide;
        double apothem = Math.sqrt(height * height + Math.pow(baseSide / 2.0, 2));
        double lateralArea = 4 * (0.5 * baseSide * apothem);
        return baseArea + lateralArea;
    }


}