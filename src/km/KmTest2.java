package km;

//양의 정수 N이 주어지면 N의 십진 표기를 반대로 뒤집어서 만들어지는 다른 정수를 표준 ㅊ풀력으로 출력하는 함수
//이 함수 결과로 선행 0을 갖는 정수를 출력할 수 없다.

public class KmTest2 {

    public static void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
                System.out.print(N % 10);
            }
            else if (enable_print != 0) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

    public static void main(String[] args) {
//        solution(11002000);
//        solution(54321);
//        solution(123123);
        solution(1100434000);
    }
}
