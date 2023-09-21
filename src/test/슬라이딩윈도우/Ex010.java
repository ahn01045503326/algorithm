package test.슬라이딩윈도우;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 최솟값 찾기 ( 슬라이딩 윈도우 ) - deque를 이용하여 정렬
 *
 * <p>
 *     입력 :
 *          12 3 // 숫자의 개수 , 슬라이딩 윈도우 크기
 *          1 5 2 3 6 2 3 7 3 5 2 6
 *
 *     출력 :
 *          1 1 1 2 2 2 2 2 3 3 2 2
 * </p>
 */
public class Ex010 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        System.out.println("N , L : " + N + "," + L);
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        Deque<Node> mydeque = new LinkedList<>();
        for(int i=0; i<N; i++) {
            int now = Integer.parseInt(stringTokenizer.nextToken());
            // 새로운 값이 들어올 때마다 정렬대신 현재 수보다 큰 값을 덱에서 제거해 시간복잡도를 줄임
            System.out.println(now);
            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                mydeque.removeLast();
            }
            mydeque.addLast( new Node(now, i) );
            // 범위에서 벗어난 값은 덱에서 제거
            if(mydeque.getFirst().index <= i - L) {
                mydeque.removeFirst();
            }
            bufferedWriter.write(mydeque.getFirst().value + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
