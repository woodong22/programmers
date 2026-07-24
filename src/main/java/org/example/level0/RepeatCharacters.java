package org.example.level0;

public class RepeatCharacters {
    public static void main(String[] args) {
        String text= "hello";
        String answer = solution(text, 3);

        System.out.println(answer);
    }
    static String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            answer = answer + String.valueOf(my_string.charAt(i)).repeat(n);
        }

        return answer;
    }
}