package programmers;

import java.util.Arrays;

public class 요격시스템 {
    public static int solution(int[][] targets) {
        if (targets.length == 0) {
            return 0;
        }

        // 개구간의 끝점을 기준으로 정렬
        Arrays.sort(targets, (a, b) -> a[1] - b[1]);

        int interceptCount = 1; // 최소 요격 미사일 수
        int end = targets[0][1]; // 현재 요격 미사일이 관통하는 개구간의 끝점

        for (int i = 1; i < targets.length; i++) {
            int start = targets[i][0]; // 개구간의 시작점

            if (start >= end) {
                interceptCount++; // 새로운 요격 미사일이 필요한 경우
                end = targets[i][1]; // 현재 요격 미사일이 관통하는 개구간의 끝점 업데이트
            }
        }

        return interceptCount;
    }

    public static void main(String[] args) {
        int[][] target = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
        System.out.println(solution(target));
    }
}
