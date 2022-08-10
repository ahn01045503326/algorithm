import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int score[] = new int[N];
        for (int i=0;i<N;i++){
            score[i]=scanner.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0;i<N;i++){
           if(score[i] > max){
               max = score[i];
           }
           sum += score[i];
        }
        System.out.println(sum*100.0/max/N);
    }
}
