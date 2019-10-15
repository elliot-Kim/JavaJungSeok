package ch5;

/* 총합과 평균 */
public class ArrayEx5 {
    public static void main(String[] args){
        int sum = 0; // 총점
        float average = 0f; // 평균

        int[] score = {100, 90, 44, 55, 23};

        for(int i = 0; i < score.length; i++) {
            sum += score[i]; //반복문을 이용해 배열에 있는 값들을 모두 더한다.
        }

        average = sum / score.length;

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    }
}
