package ch5;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[] {100, 95, 90, 85};
        int[] iArr3 = {100, 95, 90, 85};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1; // 1~10 숫자를 순서대로 배열에 넣는다.
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1; // 1~10 의 임의의 값을 저장
        }

        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
