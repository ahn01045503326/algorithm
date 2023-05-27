package programmers;

import java.util.HashMap;
import java.util.Map;

public class 공원산책 {
    public static int[] solution(String[] park, String[] routes) {

        int startX = 0;
        int startY = 0;
        int height = park.length;
        int width = park[0].length();

// 1. 배열 park 2차원 배열로 변경하며 시작 좌표 찾기
        char[][] xy = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                char[] x = park[i].toCharArray();
                xy[i][j] = x[j];

                if (xy[i][j] == 'S') {
                    startX = j;
                    startY = i;
                }
            }
        }

// 2. 배열 routes를 각각 방향과 거리를 담을 배열로 나누기
        String[] direction = new String[routes.length];
        int[] distance = new int[routes.length];
        for (int i = 0; i < routes.length; i++) {
            direction[i] = routes[i].split(" ")[0];
            distance[i] = Integer.parseInt(routes[i].split(" ")[1]);
        }

// 3. for분을 돌며 방향에 따라 조건이 맞는지 확인하고 맞다면 moveToX()/moveToY() 메서드 실행
        for (int i = 0; i < routes.length; i++) {
            switch (direction[i]) {
                case "E":
                    if (startX + distance[i] < width) {
                        startX = moveToX(direction[i], startX, distance[i], xy, startY);
                    }
                    break;
                case "W":
                    if (startX - distance[i] >= 0) {
                        startX = moveToX(direction[i], startX, distance[i], xy, startY);
                    }
                    break;
                case "S":
                    if (startY + distance[i] < height) {
                        startY = moveToY(direction[i], startY, distance[i], xy, startX);
                    }
                    break;
                case "N":
                    if (startY - distance[i] >= 0) {
                        startY = moveToY(direction[i], startY, distance[i], xy, startX);
                    }
                    break;
                default:
                    break;
            }
        }

        int[] answer = {startY, startX};
        System.out.println(startX+","+startY);
        return answer;
    }

    // 4-1. x축 방향으로 움직여야 하는 방향 "E"와 "W"일 때 실행
    public static int moveToX(String direction, int startX, int d, char[][] xy, int startY) {
        int X = startX;
        if ("E".equals(direction)) {
            for (int i = 0; i < d; i++) {
                startX++;
                if (xy[startY][startX] == 'X') {
                    startX = X;
                    break;
                }
            }
        } else {
            for (int i = 0; i < d; i++) {
                startX--;
                if (xy[startY][startX] == 'X') {
                    startX = X;
                    break;
                }
            }
        }
        return startX;
    }

    // 4-2. y축 방향으로 움직여야 하는 방향 "S"와 "N"일 때 실행
    public static int moveToY(String direction, int startY, int d, char[][] xy, int startX) {
        int Y = startY;
        if ("S".equals(direction)) {
            for (int i = 0; i < d; i++) {
                startY++;
                if (xy[startY][startX] == 'X') {
                    startY = Y;
                    break;
                }
            }
        } else {
            for (int i = 0; i < d; i++) {
                startY--;
                if (xy[startY][startX] == 'X') {
                    startY = Y;
                    break;
                }
            }
        }
        return startY;
    }


    public static void main(String[] args) {
        // ["OSO", "OOO", "OXO", "OOO"], ["E 2", "S 3", "W 1"]   기댓값 〉	[0, 0]
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
        solution(park,routes);
    }
}
