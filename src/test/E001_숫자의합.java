package test;

import java.util.Scanner;

public class E001_숫자의합 {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();      // 숫자의 개수
        String num = scanner.next();    // 공백 없이 주어진 N개의 숫자
        char[] cArray = num.toCharArray();
        int sum = 0;

        for(char ch: cArray){
            sum += Integer.parseInt(String.valueOf(ch));

        }
        System.out.println("합 : "+sum);
    }

}
