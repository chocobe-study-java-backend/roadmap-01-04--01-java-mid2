맞아요. Map의 key는 중복을 허용하지 않아서, 전체 key를 Set<K>로 제공해요. 그래서 이름이 keySet()이에요. value는 중복될 수 있어요.

아래 예시들은 각각 독립적이에요.

import java.util.Map;
import java.util.HashMap;

# 1. 생성과 구현체 선택

Map<String, Integer> scores = new HashMap<>();

String은 key, Integer는 value의 타입이에요.

| 구현체 | key의 순서 |
|---|---|
| HashMap | 순서 보장 없음 |
| LinkedHashMap | 기본적으로 삽입 순서 유지 |
| TreeMap | key의 정렬 순서 유지 |

우선 일반적인 저장·조회에는 HashMap을 사용하면 돼요.

# 2. 저장과 수정 — put()

Map<String, Integer> scores = new HashMap<>();

scores.put("철수", 80);
scores.put("영희", 90);
scores.put("철수", 95); // 기존 key이면 value를 교체

System.out.println(scores.size()); // 2
System.out.println(scores.get("철수")); // 95

Set의 add()와 달리, 같은 key로 put()하면 기존 value를 덮어써요.

# 3. 조회 — get(), getOrDefault()

Map<String, Integer> scores = new HashMap<>();
scores.put("철수", 80);

Integer score = scores.get("철수"); // 80
Integer missing = scores.get("민수"); // null

int defaultScore = scores.getOrDefault("민수", 0); // 0

getOrDefault()는 key가 없을 때 지정한 기본값을 반환해요. 기본값을 Map에 저장하지는 않아요.

없는 key의 get() 결과를 바로 int에 담으면, null을 언박싱하면서 예외가 발생하므로 주의하세요.

# 4. 존재 여부 — containsKey(), containsValue()

Map<String, Integer> scores = new HashMap<>();
scores.put("철수", 80);

boolean hasName = scores.containsKey("철수"); // true
boolean hasScore = scores.containsValue(80); // true

HashMap은 key로 찾는 데 적합해요. value 검색은 일반적으로 요소들을 확인해야 해요.

# 5. 삭제 — remove()

Map<String, Integer> scores = new HashMap<>();
scores.put("철수", 80);

Integer removed = scores.remove("철수"); // 삭제한 value: 80
Integer missing = scores.remove("민수"); // 없으면 null

# 6. key 전체 순회 — keySet()

Map<String, Integer> scores = new HashMap<>();
scores.put("철수", 80);
scores.put("영희", 90);

for (String name : scores.keySet()) {
System.out.println(name);
}

keySet()의 반환 타입은 여기서 Set<String>이에요.

# 7. value 전체 순회 — values()

for (int score : scores.values()) {
System.out.println(score);
}

values()는 중복을 허용해야 하므로 Set이 아닌 **Collection<V>**를 반환해요.

# 8. key와 value 함께 순회 — entrySet()

for (Map.Entry<String, Integer> entry : scores.entrySet()) {
String name = entry.getKey();
int score = entry.getValue();

    System.out.println(name + ": " + score);
}

Entry는 key와 value 한 쌍이에요. 둘 다 필요할 때 자주 사용하는 방식이에요.

# 9. 크기, 출력, 전체 삭제

System.out.println(scores.size());    // 저장된 key-value 쌍의 수
System.out.println(scores.isEmpty()); // 비어 있는지
System.out.println(scores);           // {철수=80, 영희=90} 형태, 순서 보장 없음

scores.clear();

# 10. 코테 활용 — 등장 횟수 세기

String[] fruits = {"사과", "배", "사과", "귤", "배", "사과"};
Map<String, Integer> counts = new HashMap<>();

for (String fruit : fruits) {
int count = counts.getOrDefault(fruit, 0);
counts.put(fruit, count + 1);
}

결과는 사과 3, 배 2, 귤 1이에요.

참고로 keySet(), values(), entrySet()은 복사본이 아니라 원본 Map과 연결된 뷰예요. 예를 들어 scores.keySet().remove("철수")는 원본 Map에서도 해당 항목을 삭제해요.

우선 put(), get(), getOrDefault(), entrySet()과 등장 횟수 세기를 중심으로 직접 적어보면 충분해요.
