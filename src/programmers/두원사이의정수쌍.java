package programmers;

public class 두원사이의정수쌍 {
    public static long solution(int r1, int r2) {
        long result = 0;
        for(int x = 1; x < r2; x++) {
            double inner = Math.sqrt(Math.pow(r1, 2) - Math.pow(x, 2)); //inner는 r1 원의 방정식에서 찾은 y값
            double outer = Math.sqrt(Math.pow(r2, 2) - Math.pow(x, 2)); //outer는 r2 원의 방정식에서 찾은 y값
            long cnt = (long) outer - (long) inner;
            if(isInteger(inner)) cnt++;
            result += cnt * 4;
        }
        return result + (r2 - r1) * 4;
    }
    private static boolean isInteger(double val) {
        return val == (long) val;
    }

    public static void main(String[] args) {
        System.out.println(solution(2,3));
    }
}
