package test;

import java.util.Scanner;

public class E002_평균구하기 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();          // 시험을 본 과목의 개수
        int[] arr = new int[N];               // 각 과목의 시험 성적
        long max = 0;
        long sum = 0;

        for(int i=0;i<=N-1;i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(sum*100.0/max/N);
    }
}
