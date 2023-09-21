package test.투포인터;

import java.util.Scanner;

/**
 * 연속된 자연수의 합 구하기 (투 포인터)
 *
 * <p>
 *     입력 : 15
 *     출력 : 4
 * </p>
 */
public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int sum = 1;
        int start_index = 1;
        int end_index = 1;

        while(end_index != N) {
            if(sum == N) {
                System.out.println(start_index + " ~ " + end_index);
                count++;
                end_index++;
                sum = sum + end_index;
            } else if(sum > N) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
