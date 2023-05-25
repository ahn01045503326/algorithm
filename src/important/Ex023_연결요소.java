package important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
    깊이우선탐색(DFS)
 */
public class Ex023_연결요소 {

    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main( String[] args ) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        A = new ArrayList[a+1];
        visited = new boolean[a+1];
        for(int i=1; i<a+1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<b; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            A[n].add(m);
            A[m].add(n);
        }

        int count = 0;
        for(int i=1; i<a+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i);
            }

        }
    }


//    public static void main( String[] args ) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int n = Integer.parseInt(stringTokenizer.nextToken());
//        int m = Integer.parseInt(stringTokenizer.nextToken());
//        A = new ArrayList[n+1];
//        visited = new boolean[n+1];
//        for(int i=1; i<n+1; i++) {
//            A[i] = new ArrayList<Integer>();
//        }
//        for(int i=0; i<m; i++) {
//            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            int s = Integer.parseInt(stringTokenizer.nextToken());
//            int e = Integer.parseInt(stringTokenizer.nextToken());
//            A[s].add(e);
//            A[e].add(s);
//        }
//        int count = 0;
//        for(int i=1; i<n+1; i++) {
//            if(!visited[i]) {
//                count++;
//                DFS(i);
//            }
//        }
//        System.out.println(count);
//    }
//
//    static void DFS(int v) {
//        if(visited[v]) {
//            return;
//        }
//        visited[v] = true;
//        for(int i : A[v]) {
//            if(!visited[i]) {
//                DFS(i);
//            }
//        }
//    }



//    static ArrayList<Integer>[] A;
//    static boolean visited[];
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int n = Integer.parseInt(stringTokenizer.nextToken());
//        int m = Integer.parseInt(stringTokenizer.nextToken());
//        A = new ArrayList[n+1];
//        visited = new boolean[n+1];
//        for(int i=1; i<n+1; i++) {
//            A[i] = new ArrayList<Integer>();
//        }
//        for(int i=0; i<m; i++) {
//            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            int s = Integer.parseInt(stringTokenizer.nextToken());
//            int e = Integer.parseInt(stringTokenizer.nextToken());
//            A[s].add(e);
//            A[e].add(s);
//        }
//        int count = 0;
//        for(int i=1; i<n+1; i++) {
//            if(!visited[i]) {
//                count++;
//                DFS(i);
//            }
//        }
//        System.out.println(count);
//    }
//
//    static void DFS(int v) {
//        if(visited[v]) {
//            return;
//        }
//        visited[v] = true;
//        for(int i : A[v]) {
//            if(!visited[i]) {
//                DFS(i);
//            }
//        }
//
//    }


//    static ArrayList<Integer>[]  A;
//    static boolean visited[];
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int n = Integer.parseInt(stringTokenizer.nextToken());
//        int m = Integer.parseInt(stringTokenizer.nextToken());
//        A = new ArrayList[n+1];
//        visited = new boolean[n+1];
//        for(int i=1; i<n+1; i++) {
//            A[i] = new ArrayList<Integer>();
//        }
//        for(int i=0; i<m; i++) {
//            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//            int s = Integer.parseInt(stringTokenizer.nextToken());
//            int e = Integer.parseInt(stringTokenizer.nextToken());
//            A[s].add(e);
//            A[e].add(s);
//        }
//        int count= 0;
//        for(int i=1; i<n+1; i++) {
//            if(!visited[i]) {
//                count++;
//                DFS(i);
//            }
//        }
//
//        System.out.println(count);
//    }
//
//    static void DFS(int v) {
//        if(visited[v]) {
//            return;
//        }
//        visited[v] = true;
//        for(int i : A[v]) {
//            if(visited[i] == false) {
//                DFS(i);
//            }
//        }
//    }


//    static ArrayList<Integer>[] A;
//    static boolean visited[];
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        A = new ArrayList[n + 1];
//        visited = new boolean[n + 1];
//        for (int i = 1; i < n + 1; i++) { // 인접 리스트 초기화
//            A[i] = new ArrayList<Integer>();
//        }
//        for (int i = 0; i < m; i++) {
//            st = new StringTokenizer(br.readLine());
//            int s = Integer.parseInt(st.nextToken());
//            int e = Integer.parseInt(st.nextToken());
//            A[s].add(e); // 양 방향 간선이므로 양쪽으로 간선을 더 해준다
//            A[e].add(s);
//        }
//        int count = 0;
//        for (int i = 1; i < n + 1; i++) {
//            if (!visited[i]) { // 미 방문한 정점이 없을 때까지 반복
//                count++;
//                DFS(i);
//            }
//        }
//        System.out.println(count);
//    }
//    static void DFS(int v) {
//        if (visited[v]) {
//            return;
//        }
//        visited[v] = true;
//        for (int i : A[v]) {
//            if (visited[i] == false) { // 연결 정점 중 방문하지 않았던 정점만 탐색함
//                DFS(i);
//            }
//        }
//    }

}
