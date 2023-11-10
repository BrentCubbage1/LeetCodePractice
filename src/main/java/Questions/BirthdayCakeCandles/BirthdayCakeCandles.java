package Questions.BirthdayCakeCandles;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

        Map<Integer, Integer> candleCount = new HashMap<>();
        Integer result = 0;

        for (Integer candle : candles) {
            if (candleCount.containsKey(candle)) {
                Integer count = candleCount.get(candle);
                candleCount.replace(candle, count, count + 1);
            } else {
                candleCount.put(candle, 1);
            }
        }

        System.out.println(candleCount); //troubleshooting purposes.

        for (int i = 0; i < candles.size(); i++){
            Integer count = candles.get(i);
            if (candleCount.get(count) > result){
                result = candleCount.get(count);
            }
        }

        return result;


    }
}
