package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer el : sourceList) {
            if (el % 2 == 0) {
                set.add(el);
                while (el % 2 == 0) {
                    el /= 2;
                    set.add(el);
                }
            } else {
                set.add(el);
                set.add(el * 2);
            }
        }
        return set;
    }
}
