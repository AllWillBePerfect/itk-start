package com.awbp;


import java.lang.reflect.Array;

public final class JavaCollectionsUtils {

    private JavaCollectionsUtils() {}

    public static <T> T[] arrayMapping(T[] array, Function<T> function) {
        T[] result = (T[]) Array.newInstance(
                array.getClass().getComponentType(),
                array.length
        );

        for (int i = 0; i < array.length; i++) {
            result[i] = function.apply(array[i]);
        }

        return result;
    }

}
