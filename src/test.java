import java.util.*;

public class test {

    public static void main(String[] args) {

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        List<Integer> answer = new ArrayList<>();
        Map<Integer, Double> map = new HashMap<>();
        double totalStage = stages.length;
        for(int i=1; i<=N; i++) {
            double count = 0;
            for(int j=0; j<stages.length; j++) {
                if(i == stages[j]) {
                    count++;
                }
            }
            double fail = 0d;
            if(totalStage != 0d) {
                fail = count / totalStage;
            }
            map.put(i,fail);

            totalStage -= count;
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            int data = 0;
            if(map.get(o2).compareTo(map.get(o1)) == 0) {
                data = o1.compareTo(o2);
            } else {
                data = map.get(o2).compareTo(map.get(o1));
            }
            return data;
        });

        for(Integer key : list) {
            answer.add(key);
        }

        System.out.println(answer);
    }
}
