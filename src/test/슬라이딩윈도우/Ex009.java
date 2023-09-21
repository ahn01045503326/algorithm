package test.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * DNA 비밀번호 ( 슬라이딩 윈도우 )
 *
 * <p>
 *     입력 :
 *          9 8
 *          CCTGGATTG
 *          2 0 1 1
 *
 *     출력 :
 *          0
 *  ------------------------
 *     입력 :
 *          4 2
 *          GATA
 *          1 0 0 1
 *
 *     출력 :
 *          2
 * </p>
 */
public class Ex009 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int P = Integer.parseInt(stringTokenizer.nextToken());
        int result = 0;
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        A = bufferedReader.readLine().toCharArray();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            if(checkArr[i] == 0) {
                checkSecret++;
            }
        }
        for(int i=0; i<P; i++) {
            // 초기 P부분 문자열 처리 부분
            addChar(A[i]);
        }
        if(checkSecret == 4) {
            result++;
        }
        // 슬라이딩 윈도우 처리 부분
        for(int i=P; i<S; i++) {
            int j = i-P;
            addChar(A[i]);
            removeChar(A[j]);
            if(checkSecret == 4) {
                result++;
            }
        }
        System.out.println(result);
        bufferedReader.close();
    }

    private static void addChar(char c) {
        switch(c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }

    private static void removeChar(char c) {
        switch (c) {
            case 'A':
                if(myArr[0] == checkArr[0]) {
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                myArr[3]--;
                break;
        }
    }
}
