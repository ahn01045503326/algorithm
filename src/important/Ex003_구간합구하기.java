package important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex003_구간합구하기 {
    /**
     * 배열 A / 합 배열 S
     * 합 배열 구하기 : S[i] = S[i-1] + A[i]
     * 구간 합 구하기 : S[j] - S[i-1]
     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int n1 = Integer.parseInt(stringTokenizer.nextToken());
//        int n2 = Integer.parseInt(stringTokenizer.nextToken());
//        long[] S = new long[n1+1];
//        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        for(int i=1;i<=n1;i++) {
//            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
//        }
//        for(int k=0;k<n2;k++) {
//            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            int k1 = Integer.parseInt(stringTokenizer.nextToken());
//            int k2 = Integer.parseInt(stringTokenizer.nextToken());
//            System.out.println(S[k2] - S[k1-1]);
//        }
//    }

//    public static void main( String[] args ) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int a = Integer.parseInt(stringTokenizer.nextToken());
//        int b = Integer.parseInt(stringTokenizer.nextToken());
//
//        long[] arr = new long[a+1];
//
//        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        for(int i=1; i<=a; i++) {
//            arr[i] = arr[i-1] + Integer.parseInt(stringTokenizer.nextToken());
//        }
//        for(int k=0; k<b; k++) {
//            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            int c = Integer.parseInt(stringTokenizer.nextToken());
//            int d = Integer.parseInt(stringTokenizer.nextToken());
//            System.out.println(arr[d] - arr[c-1]);
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[a+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<a+1; i++){
            arr[i] = arr[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int i=0; i<b; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            int d = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(arr[d]-arr[c-1]);
        }
    }
}
