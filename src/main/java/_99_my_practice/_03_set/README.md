Set은 중복 없이 값을 저장하고, 특정 값이 있는지 확인할 때 사용해요. List와 달리 인덱스로 조회하는 get()은 없어요.

아래 예시들은 각각 독립적이에요. 필요한 import예요.

```java
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
```

# 1. 생성과 구현체 선택

```java
Set<Integer> numbers = new HashSet<>();       // 순서 보장 없음
Set<Integer> ordered = new LinkedHashSet<>(); // 삽입 순서 유지
Set<Integer> sorted = new TreeSet<>();        // 정렬 순서 유지
```

일반적인 중복 제거와 존재 여부 확인에는 HashSet부터 사용하면 돼요.

# 2. 추가와 중복 확인 — add()

```java
Set<Integer> numbers = new HashSet<>();

boolean first = numbers.add(10);  // true: 추가됨
boolean second = numbers.add(10); // false: 이미 있어서 추가 안 됨

numbers.add(20);

System.out.println(numbers.size()); // 2
```

중복값을 추가해도 예외가 발생하지 않고, false를 반환해요.

# 3. 존재 여부 확인 — contains()

```java
Set<String> names = new HashSet<>(Set.of("철수", "영희"));

boolean exists = names.contains("철수");  // true
boolean missing = names.contains("민수"); // false
```

# 4. 삭제 — remove()

```java
Set<Integer> numbers = new HashSet<>(Set.of(10, 20, 30));

boolean removed = numbers.remove(20); // true
boolean missing = numbers.remove(99); // false
```

Set에는 인덱스가 없으므로 remove(20)은 값 20을 삭제해요. List<Integer>처럼 인덱스 삭제와 혼동할 필요가 없어요.

# 5. 크기, 순회, 전체 삭제

```java
Set<Integer> numbers = new HashSet<>(Set.of(10, 20, 30));

System.out.println(numbers.size());    // 3
System.out.println(numbers.isEmpty()); // false

for (int number : numbers) {
System.out.println(number);
}

System.out.println(numbers); // HashSet이므로 출력 순서는 보장되지 않음

numbers.clear();
System.out.println(numbers.isEmpty()); // true
```

# 6. List의 중복 제거

```java
List<Integer> list = List.of(30, 10, 30, 20, 10);

Set<Integer> unique = new HashSet<>(list);
Set<Integer> ordered = new LinkedHashSet<>(list);
Set<Integer> sorted = new TreeSet<>(list);

System.out.println(unique);  // 10, 20, 30을 포함하지만 순서는 보장 없음
System.out.println(ordered); // [30, 10, 20]
System.out.println(sorted);  // [10, 20, 30]
```

이 예시는 import java.util.List;도 필요해요.

# 7. 합집합·교집합·차집합

```java
Set<Integer> a = Set.of(1, 2, 3);
Set<Integer> b = Set.of(3, 4, 5);

Set<Integer> union = new HashSet<>(a);
union.addAll(b);    // 합집합: 1, 2, 3, 4, 5

Set<Integer> intersection = new HashSet<>(a);
intersection.retainAll(b); // 교집합: 3

Set<Integer> difference = new HashSet<>(a);
difference.removeAll(b);   // 차집합: 1, 2
```

이 메서드들은 호출한 Set 자체를 변경해요. 그래서 원본을 유지하려고 복사본을 만들었어요.

마지막으로 두 가지를 기억하면 좋아요.

- Set.of(...)는 변경 불가이고, 중복값을 전달하면 예외가 발생해요.
- 직접 만든 객체를 HashSet에 저장할 때는 equals()와 hashCode()를 함께 올바르게 재정의해야 의도한 기준으로 중복을 판단할 수 있어요.

우선 add(), contains(), remove()와 세 구현체의 순서 차이를 중심으로 적어보세요. 집합 연산은 필요할 때 찾아 쓸 수 있는 정도면 충분해요.