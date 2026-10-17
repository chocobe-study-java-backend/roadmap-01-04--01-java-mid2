package _02_collection._06_deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        // 데이터 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.peekFirst() = " + stack.peekFirst());
        System.out.println("stack.peekLast() = " + stack.peekLast());

        // 데이터 꺼내기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
    }
}
