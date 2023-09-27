package test.버블정렬;

import java.util.Scanner;

/**
 * 수 정렬하기 ( 버블정렬)
 * N개의 수가 주어졌을 때 이를 오름차순 정렬
 *
 * <입력>
 *     5
 *     5
 *     2
 *     3
 *     4
 *     1
 *
 * <출력>
 *     1
 *     2
 *     3
 *     4
 *     5
 */
public class Ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<N-1-i; j++) {
                if(A[j] > A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for(int i=0; i<N; i++) {
            System.out.println(A[i]);
        }
    }
}
