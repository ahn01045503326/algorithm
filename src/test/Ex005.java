package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나머지 합 구하기
 *
 * <p>
 *     5 3
 *     1 2 3 1 2
 * </p>
 *
 * <p>
 *     결과 : 7
 * </p>
 */
public class Ex005 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in) );
        StringTokenizer stringTokenizer = new StringTokenizer( bufferedReader.readLine() );

        int arrayCount = Integer.parseInt( stringTokenizer.nextToken() );
        int remainderCount = Integer.parseInt( stringTokenizer.nextToken() );

        stringTokenizer = new StringTokenizer( bufferedReader.readLine() );

        // questionArray : 입력 받은 수
        // sumArray : 합 배열
        // remainderArray : 합 배열에서 remainderCount를 나눈 나머지 값 배열
        // sameRemainder : 나머지가 같은 수 배열
        // result : 나머지 합
        int[] questionArray = new int[arrayCount];
        int[] sumArray = new int[arrayCount];
        int[] remainderArray = new int[arrayCount];
        int[] sameRemainder = new int[remainderCount];
        int result = 0;

        for (int i=0; i<arrayCount; i++) {
            questionArray[i] = Integer.parseInt( stringTokenizer.nextToken() );
            if(i == 0) {
                sumArray[i] = questionArray[i];
            } else {
                sumArray[i] = sumArray[i-1] + questionArray[i];
            }
            remainderArray[i] = sumArray[i] % remainderCount;
            if(remainderArray[i] == 0) {
                result++;
            }
            sameRemainder[remainderArray[i]]++;
        }

        // 나머지가 같은 수 배열에서 경우의 수를 result에 더하기
        for(int j=0; j<remainderCount; j++) {
            if(sameRemainder[j]>1) {
                result = result + ( sameRemainder[j] * (sameRemainder[j]-1) / 2 );
            }
        }
        System.out.println(result);
    }
}
