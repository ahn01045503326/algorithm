package test.버블정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 버블 소트 프로그램1
 *
 * <입력>
 *     5
 *     10
 *     1
 *     5
 *     2
 *     3
 *
 * <출력>
 *     3
 */
public class Ex017 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        mData[] A = new mData[N];
        for(int i=0; i<N; i++) {
            A[i] = new mData(Integer.parseInt(bufferedReader.readLine()), i);
        }
        Arrays.sort(A); // A 배열 정렬
        int Max = 0;
        for(int i=0; i<N; i++) {
            if(Max < A[i].index-i) {    // 정렬 전 index - 정렬 후 index 계산의 최대값 저장하기 (버블 정렬은 왼쪽부터 오른쪽으로 swap하기 때문에 가장 많이 이동한 값)
                Max = A[i].index-i;
            }
        }

        System.out.println(Max+1);  // swap이 일어나지 않은 반복문까지 계산해서 1을 더함.
    }


}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) { // value 기준 오름차순 정렬하기
        return this.value - o.value;
    }
}
