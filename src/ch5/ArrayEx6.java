package ch5;
/* 최대값과 최소값 */
public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {100, 90, 44, 55, 23};

        // 최대값 및 최소값을 배열의 첫번째 값으로 초기화
        int max = score[0];
        int min = score[0];

        //반복문을 통해 최대값 또는 최소값을 하나씩 비교하며 업데이트
        for(int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        } //for
            System.out.println("최대값:" + max);
            System.out.println("최소값:" + min);
    }//main
}
