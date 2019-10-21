package ch5;
/* 랜덤 배열 생성 후 각 숫자의 개수 세기 */
public class ArrayEx11 {
    public static void main(String[] args) {

        //길이가 10인 numArr배열 생성 후 중복을 허용해 0~9의 임의의 정수 값으로 채운다
        int[] numArr = new int[10];
        // counter배열은 전부 0으로 초기화
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * numArr.length);
            System.out.print(numArr[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++){
            counter[numArr[i]]++; // counter[numArr[i]] = counter[numArr[i]] + 1;
        }

        for (int i = 0; i < numArr.length; i++){
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }// main의 끝
}
