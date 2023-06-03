package programmers;

/*
옷을 총 n개 배송하려고 할 때, 상자의 크기에 상관없이 상자의 개수를 최소화하여 배송비를 줄이려고 한다고 이해했습니다.
이 문제는 주어진 옷의 개수를 최소한의 상자로 나누는 문제로 볼 수 있습니다.
상자의 크기가 3개와 5개인 두 종류의 상자가 있으며, 배송할 옷의 개수를 n이라고 가정하겠습니다.
이 문제는 일반적으로 "거스름돈을 줄이는 문제"로 알려져 있습니다.
우선, 5개짜리 상자로 최대한 많이 옷을 담는 것이 이상적입니다.
만약 옷의 개수인 n이 5로 나누어 떨어진다면, 5개짜리 상자만으로 모든 옷을 담을 수 있습니다.
그렇지 않다면, 5개짜리 상자에는 옷을 최대한 많이 담고 남은 옷을 3개짜리 상자로 채워야 합니다.
이때, 5개짜리 상자에 들어간 옷의 개수를 5로 나눈 나머지를 구하고, 그 나머지 개수만큼 3개짜리 상자를 추가로 사용합니다.
*/


public class Test {
    public int solution(int n) {

        // 5개짜리 상자로 최대한 많이 채우기
        int boxCount = n / 5;

        while (boxCount > 0) {
            int remainingClothes = n - (boxCount * 5);

            // 남은 옷을 3개짜리 상자로 채울 수 있는지 확인
            if (remainingClothes % 3 == 0) {
                return boxCount + (remainingClothes / 3);
            }

            // 5개짜리 상자 개수를 줄여가며 다시 시도
            boxCount--;
        }

        // 옷을 모두 배송할 수 없는 경우
        return -1;
    }


    public static void main(String[] args) {
        System.out.println();
    }
}
