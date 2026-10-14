지금은 생성, 추가, 조회·수정, 삭제, 순회를 먼저 익히면 충분해요. 예시는 ArrayList로 만들고 List 타입으로 사용해볼게요.

아래 예시들은 각각 독립적이에요. 공통으로 다음 import가 필요해요.

```java
import java.util.ArrayList;
import java.util.List;
```

# 1. 생성과 초기화

```java
List<Integer> numbers = new ArrayList<>(); // 빈 가변 리스트

List<Integer> scores = new ArrayList<>(List.of(70, 80, 90));
```

List.of(...) 자체는 변경 불가 리스트지만, 새 ArrayList로 복사한 scores는 변경할 수 있어요.

# 2. 요소 추가 — add()

```java
List<String> names = new ArrayList<>();

names.add("철수");    // 맨 뒤에 추가
names.add("영희");    // [철수, 영희]
names.add(1, "민수"); // 인덱스 1에 삽입 → [철수, 민수, 영희]
```

배열과 마찬가지로 인덱스는 0부터 시작해요.

# 3. 조회와 수정 — get(), set()

```java
List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));

int first = numbers.get(0); // 10
numbers.set(1, 99);         // [10, 99, 30]
```

set()은 기존 요소를 교체하므로 요소 수는 변하지 않아요.

# 4. 크기와 빈 리스트 확인 — size(), isEmpty()

```java
List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));

int size = numbers.size();                    // 3
boolean empty = numbers.isEmpty();            // false
int last = numbers.get(numbers.size() - 1);   // 30
```

배열은 length, 리스트는 **size()**예요. 빈 리스트에서는 마지막 요소를 조회할 수 없어요.

# 5. 삭제 — remove()

```java
List<String> names =
new ArrayList<>(List.of("철수", "영희", "민수"));

names.remove(0);      // 인덱스로 삭제 → [영희, 민수]
names.remove("민수"); // 값으로 삭제 → [영희]
```

List<Integer>에서는 특히 주의하세요.

```java
List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));

numbers.remove(1);                   // 인덱스 1 삭제 → [10, 30]
numbers.remove(Integer.valueOf(10)); // 값 10 삭제 → [30]
```

값으로 삭제하면 일치하는 첫 번째 요소 하나만 삭제해요.

# 6. 검색 — contains(), indexOf()

```java
List<String> names =
new ArrayList<>(List.of("철수", "영희", "철수"));

boolean exists = names.contains("영희"); // true
int index = names.indexOf("철수");       // 첫 번째 위치: 0
int missing = names.indexOf("민수");     // 없으면 -1
```

# 7. 순회와 출력

```java
List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));

// 인덱스가 필요할 때
for (int i = 0; i < numbers.size(); i++) {
    System.out.println(i + ": " + numbers.get(i));
}

// 값을 하나씩 읽을 때
for (int number : numbers) {
    System.out.println(number);
}

// 리스트 전체 출력
System.out.println(numbers); // [10, 20, 30]
```

리스트는 배열과 달리 그대로 출력해도 내용이 보여요.

# 8. 전체 삭제 — clear()

```java
List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));

numbers.clear();

System.out.println(numbers);           // []
System.out.println(numbers.isEmpty()); // true
```

우선 이 기능들을 적어보고, 특히 add(인덱스, 값)은 삽입, set(인덱스, 값)은 교체라는 차이와 **정수 리스트의 remove()**를 직접 실행해보면 좋아요.
