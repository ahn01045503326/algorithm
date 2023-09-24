package test.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 절대값 힙 구현하기
 *
 * 절대값 힙은 다음과 같은 연산을 구현하는 자료구조이다.
 * 1. 배열에 정수 x(x!=0)을 넣는다.
 * 2. 배열에서 절대값이 가장 적은 값을 출력한 후 그 값을 배열에서 제거한다.
 * 3. 절대값이 가장 작은 값이 여러 개일 경우에는 그 중 가장 작은 수를 출력하고 그 값을 배열에서 제거한다.
 *
 *
 * <입력>
 *     18 // 연산의 개수
 *     1    // 1
 *     -1   // -1 1
 *     0
 *     0
 *     0
 *     1    // 1
 *     1    // 1 1
 *     -1   // -1 1 1
 *     -1   // -1 -1 1 1
 *     2    //
 *     -2
 *     0
 *     0
 *     0
 *     0
 *     0
 *     0
 *     0
 *
 * <출력>
 *     -1
 *     1
 *     0
 *     -1
 *     -1
 *     1
 *     1
 *     -2
 *     2
 *     0
 */
public class Ex014 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        // PriorityQueue는 Heap으로 구현
        // Heap은 이진트리 형태로 정렬
        // o1은 priorityQueue.add한 값이고 이진트리에 있는 윗 레벨 값이다.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1,o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;    // 절대값이 같으면 음수 우선 정렬하기
            } else {
                return first_abs - second_abs;  // 절대값을 기준으로 정렬하기
            }
        });

        for(int i=0; i<N; i++) {
            int request = Integer.parseInt(bufferedReader.readLine());
            if(request == 0) {
                if(priorityQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(priorityQueue.poll());
                }
            } else {
                priorityQueue.add(request);
            }
        }
    }
}
