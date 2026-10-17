package _02_collection._05_map.test;

import java.util.Arrays;
import java.util.HashMap;

public class WordFrequencyTest1 {

    static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        HashMap<String, Integer> fruitMap = new HashMap<>();
        Arrays.stream(text.split(" "))
                .forEach(fruit -> {
                    Integer count = fruitMap.getOrDefault(fruit, 0);
                    fruitMap.put(fruit, count + 1);
                });

        System.out.println(fruitMap);
    }
}
