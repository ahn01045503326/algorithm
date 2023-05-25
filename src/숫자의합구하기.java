import java.util.Scanner;

public class 숫자의합구하기 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();      // 숫자의 개수
        String num = scanner.next();    // 공백 없이 주어진 N개의 숫자
        char[] cArray = num.toCharArray();
        int sum = 0;

        for(char ch: cArray){
            sum += Character.getNumericValue(ch);
        }
        System.out.println("합 : "+sum);
    }
}
