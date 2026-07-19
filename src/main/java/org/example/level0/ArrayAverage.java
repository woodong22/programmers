package org.example.level0;

public class ArrayAverage {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
         */
        int[] numbers = {89,90,91,92,93,94,95,96,97,98,99};
        System.out.println(Solution(numbers));
    }
    static double Solution(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }
}
