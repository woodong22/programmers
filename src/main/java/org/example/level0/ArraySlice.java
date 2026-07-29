package org.example.level0;

import java.util.Arrays;

public class ArraySlice {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        System.out.println(
                Arrays.toString(solution(numbers, num1, num2))
        );
    }

    static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[num1 + i];
        }

        return answer;
    }
}
