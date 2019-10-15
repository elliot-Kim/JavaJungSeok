package ch5;

/* System.arraycopy()연습 */

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.println(abc);
        System.out.println(num);

        //배열 abc와 num을 합쳐 result배열 생성
        char[] result = new char[abc.length + num.length];
        // 먼저 abc를 복사하고
        System.arraycopy(abc, 0, result, 0, abc.length);
        // abc복사된 위치 이후로 num 복사
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // num배열에 abc 배열 덮어쓰기
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        // num배열의 6번째 인덱스 위치에 abc배열의 앞 2개요소 덮어쓰기
        System.arraycopy(abc, 0, num, 6, 2);
        System.out.println(num);
    }
}
