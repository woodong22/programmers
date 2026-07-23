package org.example.level0;

import java.util.Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = solution(num_list);

        System.out.println(Arrays.toString(answer));

    }
    static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
