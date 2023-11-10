package Questions.MiniMaxSum;

import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        Long min = Long.MAX_VALUE;
        Long max = 0L;

        for (int i = 0; i < arr.size(); i++) {
            Long sum = 0L;
            for (int j = 0; j < arr.size(); j++) {
                if (j != i) {
                    sum += arr.get(j);
                }
            }
            if (sum > max) {
                max = sum;
            }
            if (sum < min) {
                min = sum;
            }
        }

        System.out.println(min + " " + max);


    }
}
