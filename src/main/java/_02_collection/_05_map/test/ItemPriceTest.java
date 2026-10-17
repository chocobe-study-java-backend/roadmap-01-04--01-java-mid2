package _02_collection._05_map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {

    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1_000);
        map.put("딸기", 1_000);

        // 코드 작성
        List<String> results = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1_000) {
                results.add(entry.getKey());
            }
        }

        System.out.println(results);
    }
}
