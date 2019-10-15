package ch5;

/*셔플 1*/
public class ArrayEx7 {
    public static void main(String[] args) {
        //길이가 10인 배열 생성 후 0~10으로 초기화
        int[] num = new int[10];
        for(int i = 0; i<num.length; i++){
            num[i] = i;
            System.out.print(num[i]);
        }

        System.out.println();

        for(int i = 0; i < 100; i++) {
            int n = (int) (Math.random() *10); // 임의의 인덱스를 고르기 위해 0~9사이의 임의의 숫자를 얻어낸다.
            // num[0] 와 num[n]의 위치를 변경
            int tmp = num[0];
            num[0] = num[n];
            num[n] = tmp;
        }

        for(int i = 0; i<num.length; i++){
            System.out.print(num[i]);
        }
    }
}
