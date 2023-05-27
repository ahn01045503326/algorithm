package programmers;

import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 인물에 대한 점수표
        Map<String, Integer> score = new HashMap<>();
        for(int i=0; i<name.length; i++) {
            score.put(name[i],yearning[i]);
        }

        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++) {
            int sum = 0; // 점수 합계
            for(int j=0; j<photo[i].length; j++) {
                if( score.containsKey(photo[i][j]) ) {
                    sum += score.get(photo[i][j]);
                }
            }
            answer[i] = sum;
            System.out.println(sum);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        solution(name,yearning,photo);
    }
}
       // 기댓값 〉	[19, 15, 6]