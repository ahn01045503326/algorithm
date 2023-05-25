package important;

import java.util.Scanner;
/*
    버블 정렬
 */
public class Ex015_수정렬하기 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] A = new int[N];
//        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
//        for (int i = 0; i < N - 1; i++) {
//            for (int j = 0; j < N - 1 - i; j++) {
//                if (A[j] > A[j + 1]) {
//                    int temp = A[j];
//                    A[j] = A[j + 1];
//                    A[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < N; i++) {
//            System.out.println(A[i]);
//        }
//    }

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int k=0; k<a-1; k++) {
            for(int j=0; j<a-1-k; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<a; i++) {
            System.out.println(arr[i]);
        }
    }

}
