package ch5;
/* 셔플2 로또 번호 생성하기 */
public class ArrayEx8 {
    public static void main(String[] args) {
        // 45개의 공간을 가진 배열을 생성 후 1 ~ 45로 초기화
        int[] num = new int[45];
        for(int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        int tmp = 0; //임시변수 tmp
        int j = 0; // 랜덤 인덱스 j

        for(int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45); // 0 ~ 44 의 임의의 정수
            tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
        }

        //배열 0 ~ 5 인덱스의 값 출력
        for(int i = 0; i < 6; i++)
            System.out.printf("num[%d]:%d%n",i, num[i]);
    }
}
