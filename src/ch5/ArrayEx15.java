package ch5;

/* 모스부호 변환기 */
public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String result = "";

        for (int i =0; i < source.length(); i++){
            result += morse[source.charAt(i) - 'A']; // 'S' - 'A' --> 83 - 65 --> 18
        }

        System.out.println("source: " + source);
        System.out.println("morse: " + result);

    }
}
