package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();

        Set<String> common = new HashSet<>(firstSet);
        common.retainAll(secondSet);
        common.removeAll(thirdSet);
        result.addAll(common);

        Set<String> onlyInThird = new HashSet<>(thirdSet);
        onlyInThird.removeAll(firstSet);
        onlyInThird.removeAll(secondSet);
        result.addAll(onlyInThird);

        return result;
    }
}
