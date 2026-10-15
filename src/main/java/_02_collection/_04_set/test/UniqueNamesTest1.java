package _02_collection._04_set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();

        for (Integer input : inputArr) {
            set.add(input);
        }

        for (Integer value : set) {
            System.out.println("value = " + value);
        }
    }
}
