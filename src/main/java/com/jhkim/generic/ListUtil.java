package com.jhkim.generic;

import java.util.List;

public class ListUtil {

    public static void printElements(List<?> list) {

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void printNumberExtendElements(List<? extends Number> list) {

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void printIntegerSuperElements(List<? super Integer> list) {

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
