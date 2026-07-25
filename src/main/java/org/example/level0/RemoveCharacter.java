package org.example.level0;

public class RemoveCharacter {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";

        String answer = solution(my_string, letter);

        System.out.println(answer);
    }

    static String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");

        return answer;
    }
}
