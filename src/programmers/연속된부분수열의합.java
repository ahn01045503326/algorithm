package programmers;


public class 연속된부분수열의합 {
    public static int[] solution(int[] sequence, int k) {
        int N = sequence.length;
        int left = 0;
        int right = N;
        int sum = 0;

        // L을 1++
        for(int L = 0, R = 0; L < N; L++) {
            // R이 N보다 작고 sum이 k보다 작으면 R을 1++
            while(R < N && sum < k) {
                sum += sequence[R];
                R++;  // R값이 +1 되므로 나중에 1을 빼야함
            }
            // sum이 k와 같으면
            if(sum == k) {
                int range = R - L - 1;
                if((right - left) > range) { // sum == k가 같은 값이 여러개 나왔을 때 range가 짧으면 변경 아니면 처음 찾았던 값 그대로
                    left = L;
                    right = R - 1; // 여기서 1을 제거
                }
            }

            sum -= sequence[L]; // L을 1++ 하고 sequence[L]값을 빼기
        }

        int[] answer = {left, right};

        return answer;
    }

    public static void main(String[] args) {
        int[] sequence1 = {2, 2, 2, 2, 2};
        int k1 = 6;
        System.out.println( solution(sequence1,k1)[0] +","+ solution(sequence1,k1)[1] );

        int[] sequence2 = {1, 2, 3, 4, 5};
        int k2 = 7;
        System.out.println( solution(sequence2,k2)[0] +","+ solution(sequence2,k2)[1] );
    }
}
