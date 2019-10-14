package ch5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];

        // for 문을 활용해 1~5 값을 저장한다.
        for (int i = 0; i < arr1.length; i++)
            arr1[i] = i + 1;

        System.out.println("변경 전");
        System.out.println("arr1.length:" + arr1.length);
        for(int i =0; i < arr1.length; i++)
            System.out.println("arr1[" + i + "]:" + arr1[i]);

        // 배열 arr1에 저장된 값들을 tmp에 복사한다.

        int[] tmp = new int[arr1.length * 2];
        for(int i =0; i < arr1.length; i++)
            tmp[i] = arr1[i];

        // arr1에 tmp를 저장한다.
        arr1 = tmp;

        System.out.println("변경 후");
        System.out.println("arr1.length:" + arr1.length);
        for(int i =0; i < arr1.length; i++)
            System.out.println("arr1[" + i + "]:" + arr1[i]);
    }
}
