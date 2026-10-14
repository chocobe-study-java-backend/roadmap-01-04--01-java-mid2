package _02_collection._03_list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            list.add(input);
        }

        int total = list.stream()
                .reduce(0, Integer::sum);

        double average = (double) total / list.size();

        System.out.println("total = " + total);
        System.out.println("average = " + average);

        scanner.close();
    }
}
