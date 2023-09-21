package test.스택과큐;

import java.util.Scanner;
import java.util.Stack;

/**
 * 스택으로 오름차순 수열 만들기
 *
 * 입력 :
 * <p>
 *     8    // 수열의 개수
 *     4
 *     3
 *     6
 *     8
 *     7
 *     5
 *     2
 *     1
 * </p>
 *
 * 출력 :
 * <p>
 *     +
 *     +
 *     +
 *     +
 *     -
 *     -
 *     +
 *     +
 *     -
 *     +
 *     +
 *     -
 *     -
 *     -
 *     -
 *     -
 * </p>
 */
public class Ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        int num = 1;    // 오름차순 수
        boolean result = true;
        for(int i=0; i<A.length; i++) {
            int su = A[i];  // 현재 수열의 수
            if(su >= num) {
                while (su >= num) { // push()
                    stack.push(num++);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            } else {
                int n = stack.pop();
                if(n>su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    stringBuffer.append("-\n");
                }
            }
        }
        if(result) {
            System.out.println(stringBuffer.toString());
        }
    }
}
