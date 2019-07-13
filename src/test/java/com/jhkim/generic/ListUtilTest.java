package com.jhkim.generic;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ListUtilTest {

    @Test
    public void printElements() {

        final List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ListUtil.<Number>printElements(list);
    }
}
