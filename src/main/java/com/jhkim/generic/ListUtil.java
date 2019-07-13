package com.jhkim.generic;

import java.util.List;

public class ListUtil {

    public static <T> void printElements(List<T> list) {

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
