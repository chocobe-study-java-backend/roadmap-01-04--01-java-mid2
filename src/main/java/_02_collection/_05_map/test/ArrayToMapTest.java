package _02_collection._05_map.test;

import java.util.*;

public class ArrayToMapTest {

    static void main(String[] args) {
        String[][] productArr  = {
                {"Java", "10000"},
                {"Spring", "20000"},
                {"JPA", "30000"}
        };

        // Map으로 변환하기
        Map<String, Integer> productMap = new HashMap<>();
        Arrays.stream(productArr)
                .forEach(product -> {
                    String name = product[0];
                    Integer price = Integer.valueOf(product[1]);
                    productMap.put(name, price);
                });

        // Map 콘솔 출력하기
        Set<String> keySet = productMap.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String name = keyIterator.next();
            Integer price = productMap.get(name);
            System.out.println("제품: " + name + ", 가격: " + price);
        }
    }
}
