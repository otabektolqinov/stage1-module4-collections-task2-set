package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        var hashSet = new HashSet<Integer>();

        for (Integer i: sourceList){
            if (i == 0){
                hashSet.add(i);
            } else if (i % 2 == 0){
                int element = i;

                while (element % 2 == 0){
                    hashSet.add(element);
                    element /= 2;
                }
                hashSet.add(element);
            } else {
                hashSet.add(i);
                hashSet.add(i * 2);
            }
        }

        return hashSet;
    }
}
