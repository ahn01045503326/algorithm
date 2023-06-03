package programmers;

import java.util.Arrays;

/*
N명의 학생이 시험을 보았습니다. 각 학생에는 1부터N까지의 번호가 붙어있습니다.
N명의 학생의 시험 점수를 바탕으로 등수를 부여하려고 합니다.
각 학생의 등수는 자신보다 높은 점수를 받은 학생의 수에 1을 더한 수입니다.
예를 들어 세 학생이 있고 1,2,3번 학생의 성적이 각각 2,2,1이라면 1,2번 학생은 가장 점수가 높고 동점이기 때문에 1등이고 3번 학생은 1,2번 학생보다 점수가 낮기 때문에 3등입니다.
1번부터 n번까지 의 점수가 순서대로 들어있는 배열 grade가 주어질 때 1번부터 n번 학생까지의 등수가 순서대로 들어있는 배열을 return
*/

public class Test2 {
    public int[] solution(int[] grade) {
        int n = grade.length; // 학생 수
        int[] ranks = new int[n]; // 등수 배열

        // 등수 초기화
        Arrays.fill(ranks, 1);

        // 등수 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grade[j] > grade[i]) {
                    ranks[i]++;
                }
            }
        }

        return ranks;

    }

    public static void main(String[] args) {

    }

}



