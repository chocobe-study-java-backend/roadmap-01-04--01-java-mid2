package _99_my_practice._02_list;

import java.util.ArrayList;
import java.util.List;

public class ListPractice01 {

    static void main(String[] args) {
        // 1. 70, 80, 90, 60을 담은 **가변 List<Integer>**를 만드세요.
        List<Integer> numList = new ArrayList<>(
                List.of(70, 80, 90, 60));


        // 2. 맨 뒤에 85를 추가하세요.
        numList.add(85);


        // 3. 인덱스 1에 75를 삽입하세요.
        numList.add(1, 75);


        // 4. 인덱스 0의 점수를 95로 수정하세요.
        numList.set(0, 95);


        // 5. 값이 60인 요소를 삭제하세요.
        numList.remove(Integer.valueOf(60));


        // 6. 90이 포함되어 있는지 출력하세요.
        boolean exists = numList.contains(90);


        // 7. 반복문으로 합계를 구하고, size()를 이용해 평균을 구하세요.
        int total = 0;
        for (int num : numList) {
            total += num;
        }

        double average = (double) total / numList.size();

        System.out.println("점수 목록: " + numList);
        System.out.println("90 포함 여부: " + exists);
        System.out.println("학생 수: " + numList.size());
        System.out.println("합계: " + total);
        System.out.println("평균: " + average);
    }
}
