package org.example.level0;

public class QuadrantFinder {
    public static void main(String[] args) {
        int[] dot = {2,4};

        System.out.println(solution(dot));
    }

    static int solution(int[] dot){
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3;
        } else {
            return 4;
        }
    }
}
