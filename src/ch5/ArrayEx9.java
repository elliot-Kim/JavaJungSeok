package ch5;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

/* 임의의 불연속적인 값으로 배열 만들기 */
public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-1, 10, -4, 200};
        int[] resultArr = new int[10];

        for(int i = 0; i < resultArr.length; i++){
            //code 의 index중 임의의 index를 생성
            int randomIndex = (int) (Math.random() * code.length);
            //code[] 중 임의의 값을 resultArr에 넣는다
            resultArr[i] = code[randomIndex];
        }
        System.out.println(Arrays.toString(resultArr));
    }
}
