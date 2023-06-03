package km;

import java.util.*;

public class KmTest3 {

    public static int solution(int N, String S) {
        int result = N * 2;
        Set<String> reservedSeats = new HashSet<>(Arrays.asList(S.split(" ")));
        for (int row = 1; row <= N; row++) {
            Set<Integer> rowSeats = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            if ( reservedSeats.contains(row + "B") ||
                    reservedSeats.contains(row + "C") ||
                    reservedSeats.contains(row + "D") ||
                    reservedSeats.contains(row + "E") ) {
                result -= 1;
            }
            if ( reservedSeats.contains(row + "F") ||
                    reservedSeats.contains(row + "G") ||
                    reservedSeats.contains(row + "H") ||
                    reservedSeats.contains(row + "J") ) {
                result -= 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int n = 22;
        String b = "1A 3C 2B 20G 5A";

        System.out.println(solution(n,b));
    }
}

/*
당신은 비행기 좌석 예약을 처리하고 있다. 비행기에는 1부터 N까지 번호가 매겨진 좌석이 N줄 있다. 아래 그림과 같이 각 줄에는 좌석이 열(10) 석 있다.
A부터 K까지  (A B C    D E F G     H J K)
일부 좌석은 이미 예약되어 있다. 예약 좌석 목록은 "1A 3C 2B 20G 5A"와 같이 한 개의 공백으로 구분된 좌석번호를 포함하는 문자열 S(길이M)로 주어진다.
S에 나열된 예약 좌석의 순서는 임의적이다.
최대한 많은 4인 가족에게 좌석을 배정하시오. 4인 가족은 한 줄에서 서로 인접한 네 좌석을 사용하며, 통로를 사이에 둔 좌석들은 서로 인접한 것으로 간주하지 않는다.
통로를 사이에 두고 가족을 분리할 수 있지만 이 경우에는 반드시 두 사람이 통로 양쪽에 앉아야 한다.
어떤 좌석도 한 가족 이상에게 배정할 수 없다.
 */