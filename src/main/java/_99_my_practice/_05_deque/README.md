이번에는 스택·큐로 사용하는 방법을 먼저 익히고, Deque의 양쪽 끝 조작을 연결해서 적어보세요. 각 예시는 독립적이에요.

공통 import예요.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

# 1. 스택 — 나중에 넣은 값을 먼저 꺼내기

Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek()); // 30: 조회만 함
System.out.println(stack.pop());  // 30: 꺼내면서 삭제
System.out.println(stack.pop());  // 20
System.out.println(stack.pop());  // 10

System.out.println(stack.isEmpty()); // true

- push(): 맨 앞에 추가
- pop(): 맨 앞에서 꺼내기
- peek(): 맨 앞 조회

# 2. 큐 — 먼저 넣은 값을 먼저 꺼내기

Queue<Integer> queue = new ArrayDeque<>();

queue.offer(10);
queue.offer(20);
queue.offer(30);

System.out.println(queue.peek()); // 10: 조회만 함
System.out.println(queue.poll()); // 10: 꺼내면서 삭제
System.out.println(queue.poll()); // 20
System.out.println(queue.poll()); // 30

System.out.println(queue.isEmpty()); // true

- offer(): 맨 뒤에 추가
- poll(): 맨 앞에서 꺼내기
- peek(): 맨 앞 조회

# 3. Deque — 양쪽 끝에서 추가·조회·삭제

Deque<Integer> deque = new ArrayDeque<>();

deque.offerLast(20);  // [20]
deque.offerFirst(10); // [10, 20]
deque.offerLast(30);  // [10, 20, 30]

System.out.println(deque.peekFirst()); // 10
System.out.println(deque.peekLast());  // 30

System.out.println(deque.pollFirst()); // 10 → [20, 30]
System.out.println(deque.pollLast());  // 30 → [20]

System.out.println(deque); // [20]

First는 맨 앞, Last는 맨 뒤예요.

# 4. 크기 확인과 전체 삭제

Deque<Integer> deque = new ArrayDeque<>();

deque.offerLast(10);
deque.offerLast(20);

System.out.println(deque.size());    // 2
System.out.println(deque.isEmpty()); // false

deque.clear();

System.out.println(deque.isEmpty()); // true

# 5. 비어 있을 때의 차이

Deque<Integer> deque = new ArrayDeque<>();

System.out.println(deque.peek());      // null
System.out.println(deque.pollFirst()); // null
System.out.println(deque.pollLast());  // null

// deque.pop(); // 비어 있으므로 NoSuchElementException 발생

null이 반환될 수 있는 결과는 바로 int에 담지 않도록 주의하세요. 언박싱 과정에서 예외가 발생해요. 또한 ArrayDeque에는 null을 저장할 수 없어요.

메서드들의 관계는 이렇게 연결돼요.

| 사용 목적 | 추가 | 조회 | 꺼내기 |
|---|---|---|---|
| 스택 | push() = addFirst() | peek() = peekFirst() | pop() = removeFirst() |
| 큐 | offer() = offerLast() | peek() = peekFirst() | poll() = pollFirst() |

우선 **스택은 push/pop, 큐는 offer/poll**을 확실하게 익히면 충분해요. 나머지는 양쪽 끝을 조작할 필요가 있을 때 연결해서 사용하면 돼요.