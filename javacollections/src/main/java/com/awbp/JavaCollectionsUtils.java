package com.awbp;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

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

    public static <T> Map<T, Long> countOfElements(T[] array) {
        return Arrays.stream(array).collect(Collectors.groupingBy(
                value -> value, Collectors.counting()
        ));
    }


}
