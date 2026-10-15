package _02_collection._04_set.test;

import java.util.*;

public class UniqueNamesTest2 {

    static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer value : set) {
            System.out.println("value = " + value);
        }

        // 리스트 생성 방법1 (권장 방법)
        List<Integer> list2 = List.of(inputArr);

        // 리스트 생성 방법2 (구 버전 방법)
        List<Integer> list1 = Arrays.asList(inputArr);
    }
}
