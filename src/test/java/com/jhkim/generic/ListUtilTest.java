package com.jhkim.generic;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ListUtilTest {

    @Test
    public void printElements() {

        // error: incompatible types: List<Integer> cannot be converted to List<Number>
        // List<Number>와 List<Integer>는 무관
        // final List<Integer> list = new ArrayList<>();
        // final List<Number> list = new ArrayList<>();

        // printElements의 타입 파라미터를 와일드카드 타입으로 지정했기 때문에 파라미터로 넘길 수 있음
        final List<Object> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        ListUtil.<Number>printElements(list);
    }
}
