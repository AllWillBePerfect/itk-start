package com.awbp;

public class Cube implements Shape3D {
    private final double edge; // Длина ребра куба

    public Cube(double edge) {
        if (edge <= 0) {
            throw new IllegalArgumentException("Ребро куба должно быть > 0");
        }

        this.edge = edge;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * edge * edge;
    }

}