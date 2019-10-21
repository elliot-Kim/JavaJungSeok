package ch5;

import java.util.Arrays;

/* bubble sort */
public class ArrayEx10 {
    public static void main(String[] args) {
        //길이가 10인 배열 생성 후 중복을 허용해 0~9의 임의의 정수 값으로 채운다
        int[] numArr = new int[10];
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * numArr.length);
        }
        System.out.println(Arrays.toString(numArr)); // 초기 numArr 출력

        // 배열의 전체 길이보다 1 작은 만큼의 반복문
        for(int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;
            // numArr[j] 와 바로 옆의 요소 numArr[j+1] 비교
            for(int j = 0; j < numArr.length - 1 - i; j++) {
                if (numArr[j] > numArr[j + 1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = tmp;
                    changed = true;
                }
            }//end for j

            // i개수만큼 하는 도중 자리바꿈이 없었다면? 더이상 하는 것이 의미없으므로 for i 에서 break
            if(!changed) break;

            for (int k = 0; k <numArr.length; k++) {
                System.out.print(numArr[k]);
            }System.out.println();
        }//end for i
    }//main
}
