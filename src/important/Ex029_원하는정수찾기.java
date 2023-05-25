package important;

import java.util.Arrays;
import java.util.Scanner;

public class Ex029_원하는정수찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int b = scanner.nextInt();
        for(int i=0; i<b; i++){
            int target = scanner.nextInt();
            boolean find = false;
            int start = 0;
            int end = arr.length-1;
            //이진탐색 시작
            while (start <= end) {
                int midi = (start+end)/2;
                int midV = arr[midi];
                if(target > midV) {
                    start = midi+1;
                } else if(target < midV) {
                    end = midi-1;
                } else if(target == midV) {
                    find = true;
                    break;
                }
            }
            System.out.println(find);
        }
    }
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int[] arr = new int[a];
//        for(int i=0; i<a; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        Arrays.sort(arr);
//        int b =scanner.nextInt();
//        for(int i=0; i<b; i++) {
//            boolean find = false;
//            int target = scanner.nextInt();
//            // 이진탐색시작
//            int start = 0;
//            int end = arr.length-1;
//            while (start <= end) {
//                int midi = (start + end) / 2;
//                int midV = arr[midi];
//                if(target < midV) {
//                    end = midi - 1;
//                } else if(target > midV) {
//                    start = midi + 1;
//                } else if(target == midV) {
//                    find = true;
//                    break;
//                }
//            }
//            System.out.println(find);
//        }
//    }
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] A = new int[N];
//        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
//        Arrays.sort(A);
//        int M = sc.nextInt();
//        for (int i = 0; i < M; i++) {
//            boolean find = false;
//            int target = sc.nextInt();
//            // 이진 탐색 시작
//            int start = 0;
//            int end = A.length - 1;
//            while (start <= end) {
//                int midi = (start + end) / 2;
//                int midV = A[midi];
//                if (midV > target) {
//                    end = midi - 1;
//                } else if (midV < target) {
//                    start = midi + 1;
//                } else {
//                    find = true;
//                    break;
//                }
//            }
//            if (find) {
//                System.out.println(1);
//            } else {
//                System.out.println(0);
//            }
//        }
//    }
}
