package _02_collection._03_list.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListEx1 {

    static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        List<Integer> studentList = Arrays.stream(students)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        int total = 0;
        for (Integer integer : studentList) {
            total += integer;
        }

        double average = (double) total / studentList.size();

        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}
