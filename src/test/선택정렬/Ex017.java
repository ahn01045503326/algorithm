package test.선택정렬;

import java.util.Scanner;

/**
 * 내림차순으로 자릿수 정렬하기
 *
 * <입력>
 *     2143
 *
 * <출력>
 *     4321
 *
 */
public class Ex017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] A = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i,i+1));
        }
        for(int i=0; i<str.length(); i++) {
            int Max = i;
            for(int j=i+1; j<str.length(); j++) {
                if(A[j] > Max) {
                    Max = j;
                }
            }
            if(A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        for(int i=0; i<str.length(); i++) {
            System.out.println(A[i]);
        }
    }
}
