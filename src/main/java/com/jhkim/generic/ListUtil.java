package com.jhkim.generic;

import java.util.List;

public class ListUtil {

    public static void printElements(List<? extends Number> list) {

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
