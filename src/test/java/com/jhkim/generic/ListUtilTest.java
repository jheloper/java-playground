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
        // 다만, 한정적 와일드카드 타입으로 변경하면 아래 List<Object>는 컴파일 오류 발생
        final List<Object> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        ListUtil.printElements(list);
    }


    @Test
    public void printNumberExtendElements() {

        // error: incompatible types: List<Object> cannot be converted to List<? extends Number>
        // Object는 Number 또는 Number의 하위 클래스가 아니기 때문에 컴파일 오류 발생
        // final List<Object> list = new ArrayList<>();

        final List<Long> list = new ArrayList<>();

        list.add(1L);
        list.add(2L);
        list.add(3L);

        ListUtil.printNumberExtendElements(list);
    }


    @Test
    public void printIntegerSuperElements() {

        // error: incompatible types: List<Long> cannot be converted to List<? super Integer>
        // Long은 Integer 또는 Integer의 상위 클래스가 아니기 때문에 컴파일 오류 발생
        // final List<Long> list = new ArrayList<>();

        final List<Number> list = new ArrayList<>();

        list.add(1L);
        list.add(2L);
        list.add(3L);

        ListUtil.printIntegerSuperElements(list);
    }
}
