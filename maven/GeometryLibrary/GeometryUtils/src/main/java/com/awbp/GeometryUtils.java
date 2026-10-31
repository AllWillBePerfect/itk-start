package com.awbp;

public final class GeometryUtils {
    private GeometryUtils() {}

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException("Количество знаков должно быть >= 0");
        }
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
