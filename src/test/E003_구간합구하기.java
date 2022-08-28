package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class E003_구간합구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        System.out.println(suNo+" : "+quizNo);
        int[] arrayN = new int[suNo+1];
        arrayN[0] = 0;
        StringTokenizer stringTokenizer1 = new StringTokenizer(bufferedReader.readLine());
        for(int i=1;i<=suNo;i++){
            arrayN[i] = Integer.parseInt(stringTokenizer1.nextToken())+arrayN[i-1];
        }
        StringTokenizer[] stringTokenizers = new StringTokenizer[quizNo];
        for(int k=0;k<quizNo;k++){
            stringTokenizers[k] = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizers[k].nextToken());
            int y = Integer.parseInt(stringTokenizers[k].nextToken());
            System.out.println(arrayN[y]-arrayN[x-1]);
        }
    }
}
