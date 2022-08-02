// N개의 수가 주어졌을 때 이를 오름차순 정렬하는 프로그램을 작성하시오

import java.util.Scanner;
public class Ex000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // i=0 , j=0,1,2,3,4
        // i=1 , j=0,1,2,3
        // i=1 , j=0,1,2
        // i=1 , j=0,1
        // i=1 , j=0
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}