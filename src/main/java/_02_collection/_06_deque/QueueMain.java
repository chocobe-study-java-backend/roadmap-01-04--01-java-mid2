package _02_collection._06_deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {

    static void main(String[] args) {
        // LinkedList 를 써도 되지만, 느리다
        // Queue<Integer> queue = new LinkedList<>();

        Queue<Integer> queue = new ArrayDeque<>();

        // 데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = " + queue);

        // 다음 꺼낼 데이터 확인 (꺼내지 않고 단순 조회만)
        System.out.println("queue.peek() = " + queue.peek());

        // 데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
    }
}
