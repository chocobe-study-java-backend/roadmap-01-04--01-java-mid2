좋아요. 지금은 배열 생성, 접근·수정, 길이, 순회, 복사를 직접 적어보면 충분해요. Java 배열은 Array 클래스로 생성하지 않고 int[]처럼 선언해요.

# 1. 생성과 초기화

```java
int[] scores = new int[3];       // {0, 0, 0}
int[] numbers = {10, 20, 30};

numbers = new int[]{40, 50, 60}; // 새 배열로 교체
```

# 2. 조회와 수정

```java
int[] numbers = {10, 20, 30};

int first = numbers[0]; // 10
numbers[1] = 99;        // {10, 99, 30}
```

인덱스는 0부터 시작해요.

# 3. 길이와 마지막 요소

```java
int[] numbers = {10, 20, 30};

int length = numbers.length;             // 3
int last = numbers[numbers.length - 1];   // 30
```

배열의 길이는 length이고, 괄호를 붙이지 않아요. 빈 배열에서는 마지막 요소에 접근할 수 없어요.

# 4. 순회

인덱스가 필요하거나 요소를 수정할 때:

```java
int[] numbers = {10, 20, 30};

for (int i = 0; i < numbers.length; i++) {
    numbers[i] += 1;
}
```

값을 하나씩 읽을 때:

```java
for (int number : numbers) {
    System.out.println(number);
}
```

# 5. 내용 출력

아래부터는 import java.util.Arrays;가 필요해요.

```java
int[] numbers = {10, 20, 30};

System.out.println(Arrays.toString(numbers)); // [10, 20, 30]
```

# 6. 같은 값으로 채우기

```java
int[] numbers = new int[3];

Arrays.fill(numbers, -1); // {-1, -1, -1}
```

# 7. 복사와 길이 변경

```java
int[] original = {10, 20, 30};

int[] copied = Arrays.copyOf(original, original.length);
int[] expanded = Arrays.copyOf(original, 5); // {10, 20, 30, 0, 0}
int[] shortened = Arrays.copyOf(original, 2); // {10, 20}
```

모두 새 배열을 만들어요. 원본 배열의 길이는 그대로예요.

# 8. 코테에서 자주 쓰는 정렬과 내용 비교

```java
int[] numbers = {30, 10, 20};

Arrays.sort(numbers); // 기존 배열을 {10, 20, 30}으로 변경

int[] expected = {10, 20, 30};
boolean same = Arrays.equals(numbers, expected); // true
```

배열의 **내용을 비교할 때는 Arrays.equals()**를 사용해요. ==는 두 변수가 같은 배열 객체를 가리키는지 비교해요.

우선 이 예시들을 적고, 실행 전에 결과를 예상해보세요. 배열 중간에 삽입·삭제하는 구현은 이후 List 사용법과 연결해서 봐도 돼요.