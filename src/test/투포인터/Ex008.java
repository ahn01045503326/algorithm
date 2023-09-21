package test.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 좋은 수 구하기 ( 투 포인터 )
 * 주어진 N개의 수에서 다른 두 수의 합으로 표시되는 수가 있다면 좋은 수라고 한다.
 *
 * <p>
 *     입력 :
 *          10
 *          1,2,3,4,5,6,7,8,9,10
 *     출력 :
 *          8
 */
public class Ex008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int number = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] array = new int[number];

        for(int i=0; i<number; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(array);

        int result = 0;

        for(int j=0; j<number; j++) {
            int startPointer = 0;
            int endPointer = number-1;
            int currentNumber = array[j];

            while (startPointer < endPointer) {
                if(currentNumber < array[startPointer] + array[endPointer]) {
                    endPointer--;
                } else if(currentNumber == array[startPointer] + array[endPointer]) {
                    if(startPointer != j && endPointer != j) {
                        result++;
                        break;
                    } else if(startPointer == j) {
                        startPointer++;
                    } else if(endPointer == j) {
                        endPointer--;
                    }
                } else {
                    startPointer++;
                }
            }
        }
        bufferedReader.close();

        System.out.println("result :" + result);
    }
}
