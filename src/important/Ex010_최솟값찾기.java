package important;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
    슬라이딩 윈도우
 */
public class Ex010_최솟값찾기 {
//    public static final Scanner scanner = new Scanner(System.in);
//
//    public static void main( String[] args ) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        // 출력을 그때 그때 하는 것보다 버퍼에 넣고 한번에 출력하기 위해 BufferedWriter를 사용
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int L = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        Deque<Node> mydeque = new LinkedList<>();
//        for (int i = 0; i < N; i++) {
//            int now = Integer.parseInt(st.nextToken());
//            // 새로운 값이 들어 올 때마다 정렬하지 않고 현재 수보다 큰 값을 덱에서 제거함으로써 시간복잡도를 줄일 수 있음
//            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
//                mydeque.removeLast();
//            }
//            mydeque.addLast(new Node(now, i));
//            // 범위에서 벗어난 값은 덱에서 제거
//            if (mydeque.getFirst().index <= i - L) {
//                mydeque.removeFirst();
//            }
//            bw.write(mydeque.getFirst().value + " ");
//        }
//        bw.flush();
//        bw.close();
//    }
//
//    static class Node {
//        public int value;
//        public int index;
//
//        Node(int value, int index) {
//            this.value = value;
//            this.index = index;
//        }
//    }


//    public static void main( String[] args ) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int a = Integer.parseInt(stringTokenizer.nextToken());
//        int b = Integer.parseInt(stringTokenizer.nextToken());
//        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        Deque<Node> deque = new LinkedList<>();
//        for(int i=0; i<a; i++) {
//            int now = Integer.parseInt(stringTokenizer.nextToken());
//            // 새로운 값이 들어 올 때마다 정렬하지 않고 현재 수보다 큰 값을 덱에서 제거함으로써 시간복잡도를 줄일 수 있음
//            while (!deque.isEmpty() && deque.getLast().value > now) {
//                deque.removeLast();
//            }
//            deque.addLast(new Node(i,now));
//            // 범위에서 벗어난 값은 덱에서 제거
//            if(deque.getFirst().index <= i - b) {
//                deque.removeFirst();
//            }
//            bw.write(deque.getFirst().value + " ");
//        }
//        bw.flush();
//        bw.close();
//    }
//
//    static class Node {
//        private int index;
//        private int value;
//
//        Node(int index, int value) {
//            this.index = index;
//            this.value = value;
//        }
//    }


}
