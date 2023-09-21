package test.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수 구하기
 *
 * 입력 :
 * <p>
 *     4
 *     3 5 2 7
 * </p>
 *
 * 출력 :
 * <p>
 *     5 7 7 -1
 * </p>
 */
public class Ex012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int[] A = new int[N];
        int[] ans = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=0; i<N; i++) {
            while (!stack.empty() && A[stack.peek()]<A[i]) {
                // 정답 배열에 오큰수를 현재 수열을 저장하기
                ans[stack.pop()] = A[i];
            }
            // 신규 데이터 push
            stack.push(i);
        }

    }
}
