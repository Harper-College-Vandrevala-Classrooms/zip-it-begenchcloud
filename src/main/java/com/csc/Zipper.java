package com.csc;

import java.util.ArrayList;
import java.util.List;

public class Zipper {

    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int maxLength = Math.max(list1.size(), list2.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }
        return mergedList;
    }
}
