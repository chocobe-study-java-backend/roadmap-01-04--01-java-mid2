package _02_collection._05_map.test;

import java.util.*;

public class CommonKeyValueSum1 {

    static void main(String[] args) {
        Map<String, Integer> map1 = Map.of(
                "A", 1,
                "B", 2,
                "C", 3);

        Map<String, Integer> map2 = Map.of(
                "B", 4,
                "C", 5,
                "D", 6);

        // 코드 작성
        Set<String> keySet1 = map1.keySet();
        Set<String> keySet2 = map2.keySet();
        Set<String> intersectionKeySet = new HashSet<>(keySet1);
        intersectionKeySet.retainAll(keySet2);

        Iterator<String> iterator = intersectionKeySet.iterator();
        HashMap<String, Integer> result = new HashMap<>();

        while (iterator.hasNext()) {
            String key = iterator.next();
            result.put(key, map1.get(key) + map2.get(key));
        }

        System.out.println(result);
    }
}
