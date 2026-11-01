package com.awbp;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Integer[] arr = JavaCollectionsUtils.arrayMapping(new Integer[] {1,2,3}, (integer) -> integer * integer);
        System.out.println(Arrays.asList(arr));

        var map = JavaCollectionsUtils.countOfElements(new Integer[] {1,2,3,4,3,2,4,5,3,2,5,6,3});
        System.out.println(map);
    }
}