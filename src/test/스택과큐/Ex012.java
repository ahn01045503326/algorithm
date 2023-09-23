package test.스택과큐;

import java.io.*;
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
        int[] A = new int[N]; // 수열 배열 생성
        int[] ans = new int[N]; // 정답 배열 생성
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        // 수열을 배열에 저장
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 처음에는 스택이 비어있으므로 최초값을 push해서 초기화

        for(int i=1; i<N; i++) {
            // 스택이 비어있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
            while (!stack.empty() && A[stack.peek()] < A[i]) { // peek(): 스택의 가장 위에 있는 항목을 반환
                // 정답 배열에 오큰수를 현재 수열을 저장하기
                ans[stack.pop()] = A[i]; // pop(): 스택에서 가장 위에 있는 항목을 제거한다.
            }
            // 신규 데이터 push
            stack.push(i);
        }

        while(!stack.empty()) { // 반복문을 다 돌고 나왔는데 스택이 비어있지 않다면 빌 때까지 반복
            ans[stack.pop()] = -1; // 스택에 쌓인 인덱스에 -1
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++) {
            bufferedWriter.write(ans[i] + " ");
        }
        bufferedWriter.write("\n");
        bufferedWriter.flush();
    }
}
