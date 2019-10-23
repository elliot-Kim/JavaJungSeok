package ch5;

/* String 과 char배열 */
public class ArrayEx14 {
    public static void main(String[] args) {
        String str = "ABCDE";

        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("str.charAt(" + i + ") :" + ch);
        }

        //String 을 char배열로 변환
        char[] chArr = str.toCharArray();

        //char배열을 출력
        System.out.println(chArr);
    }
}
