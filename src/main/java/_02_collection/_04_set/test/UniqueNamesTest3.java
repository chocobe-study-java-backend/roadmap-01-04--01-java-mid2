package _02_collection._04_set.test;

import java.util.*;

public class UniqueNamesTest3 {

    static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new TreeSet<>(List.of(inputArr));

        for (Integer value : set) {
            System.out.println("value = " + value);
        }
    }
}
