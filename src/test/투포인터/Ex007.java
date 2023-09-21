package test.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 2가지 재료로 갑옷을 만들 수 있는 수의 합 (투 포인터)
 *
 * <p>
 *     입력 :
 *          6 (재료의 개수) ,
 *          9 (갑옷이 완성되는 번호의 합),
 *          2 7 4 1 5 3 (재료들)
 *
 *     출력 :
 *          2
 * </p>
 */
public class Ex007 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int[] A = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = N -1;

        while(i < j) {
            if(A[i] + A[j] < M) {
                i++;
            } else if(A[i] + A[j] > M) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
        bufferedReader.close();
    }
}
