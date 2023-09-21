package test.스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 카드게임 (1. poll 2. add(poll))
 *
 * 입력 :
 * <p>
 *     6
 * </p>
 *
 * 출력 :
 * <p>
 *     4
 * </p>
 */
public class Ex013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++) {
            myQueue.add(i);
        }
        while(myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());
    }
}

