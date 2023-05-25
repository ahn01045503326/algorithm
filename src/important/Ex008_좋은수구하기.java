package important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex008_좋은수구하기 {
//    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//        int Result = 0;
//        long A[] = new long[N];
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        for (int i=0;i<N;i++){
//            A[i] = Long.parseLong(st.nextToken());
//        }
//        Arrays.sort(A);
//        for(int k=0;k<N;k++) {
//            long find = A[k];
//            int i=0;
//            int j=N-1;
//            while (i<j) {
//                if(A[i] + A[j] == find) {
//                    if(i != k && j !=k) {
//                        Result++;
//                        break;
//                    } else if(i == k) {
//                        i++;
//                    } else if(j == k) {
//                        j++;
//                    }
//                } else if(A[i] + A[j] < find) {
//                    i++;
//                } else {
//                    j--;
//                }
//            }
//        }
//        System.out.println(Result);
//        bf.close();


//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bf.readLine());
//        int Result = 0;
//        long A[] = new long[N];
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        for (int i = 0; i < N; i++) {
//            A[i] = Long.parseLong(st.nextToken());
//        }
//        Arrays.sort(A);
//        for (int k = 0; k < N; k++) {
//            long find = A[k];
//            int i = 0;
//            int j = N - 1;
//            while (i < j) {  // 투포인터 알고리즘
//                if (A[i] + A[j] == find) {
//                    // find는 서로 다른 두 수의 합이여야됨을 체크
//                    if (i != k && j != k) {
//                        Result++;
//                        break;
//                    } else if (i == k) {
//                        i++;
//                    } else if (j == k) {
//                        j--;
//                    }
//                } else if (A[i] + A[j] < find) {
//                    i++;
//                } else {
//                    j--;
//                }
//            }
//        }
//        System.out.println(Result);
//        bf.close();
//    }


//    public static void main (String[] args ) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int a = Integer.parseInt(stringTokenizer.nextToken());
//        int[] arr = new int[a];
//        int result = 0;
//
//        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        for(int i=0; i<a; i++) {
//            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
//        }
//        Arrays.sort(arr);
//
//        for(int k=0; k<a; k++) {
//            int find = arr[k];
//            int b = 0;
//            int c = a-1;
//            while(b<c) {
//                if(arr[b]+arr[c] == find) {
//                    if(b == k) {
//                        b++;
//                    } else if(c == k) {
//                        c--;
//                    } else {
//                        result ++;
//                        break;
//                    }
//                } else if(arr[b]+arr[c] < find) {
//                    b++;
//                } else {
//                    c--;
//                }
//            }
//        }
//        System.out.println(result);
//        bufferedReader.close();
//    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[a];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<a; i++) {
            int find = arr[i];
            int start = 0;
            int end = a-1;
            while (start < end) {
                if(arr[start]+arr[end] < find) {
                    start++;
                } else if(arr[start]+arr[end] > find) {
                    end--;
                } else {
                    if (start == i) {
                        start++;
                    } else if(end == i) {
                        end--;
                    }
                    else {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
