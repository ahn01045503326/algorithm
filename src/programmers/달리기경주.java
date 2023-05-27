package programmers;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {

    public static String[] solution(String[] players, String[] callings) {
        int n = players.length; // 선수 수
        Map<String, Integer> playerRank = new HashMap<>(); // 선수 이름과 등수를 매핑하는 맵

        // 선수 이름과 초기 등수를 맵에 저장
        for (int i = 0; i < n; i++) {
            playerRank.put(players[i], i + 1);
        }

        Map<Integer, String> rank = new HashMap<>(); // 선수 이름과 등수를 매핑하는 맵
        // 선수 이름과 초기 등수를 맵에 저장
        for (int i = 0; i < n; i++) {
            rank.put(i+1, players[i]);
        }

        // 해설진이 부른 이름에 따라 등수 갱신
        for (String calling : callings) {
            int currentPlayerRank = playerRank.get(calling); // 현재 선수의 등수
            int newPlayerRank = currentPlayerRank - 1; // 추월하여 등수 변경
            String getPlayerName = rank.get(newPlayerRank); // 추월한 선수의 이름

            playerRank.replace(calling, newPlayerRank); // 등수 갱신
            playerRank.replace(getPlayerName, currentPlayerRank); // 추월한 선수들의 등수도 변경
            rank.replace(newPlayerRank, calling);
            rank.replace(currentPlayerRank, getPlayerName);
        }

        // 등수별로 선수 이름을 정렬하여 결과 배열에 저장
        String[] result = new String[n];
        for (Map.Entry<String, Integer> entry : playerRank.entrySet()) {
            result[entry.getValue() - 1] = entry.getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        for(String test : solution(players,callings)) {
            System.out.println(test);
        }
    }

}
