package _99_my_practice._01_array;

import java.util.Arrays;

public class ArrayPractice01 {

    /*
    문제: 점수 보정하기

    점수는 70, 85, 90, 60, 75예요.

    1. 점수들을 int[] 배열에 저장하세요.
    2. 반복문으로 모든 점수를 5점씩 올리세요.
    3. 보정된 배열을 출력하세요.
    4. 반복문으로 보정된 점수의 합계를 구하세요.
    5. 배열의 길이를 이용해서 평균을 소수점까지 구하세요.
    */
    static void main(String[] args) {
        // 1. 점수들을 int[] 배열에 저장하세요.
        int[] arr = {70, 85, 90, 60, 75};


        // 2. 반복문으로 모든 점수를 5점씩 올리세요.
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }


        // 3. 보정된 배열을 출력하세요.
        System.out.println(Arrays.toString(arr));


        // 4. 반복문으로 보정된 점수의 합계를 구하세요.
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("합계: " + sum);


        // 5. 배열의 길이를 이용해서 평균을 소수점까지 구하세요.
        double avg = (double) sum / arr.length;
        System.out.println("평균: " + avg);
    }
}
