package Questions.GoodVsEvil;
import java.util.HashMap;
import java.util.Map;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        String[] goodForces = goodAmounts.split(" ");
        String[] evilForces = evilAmounts.split(" ");

        Map<Integer, Integer> goodMap = new HashMap<>();
        goodMap.put(0, 1);
        goodMap.put(1, 2);
        goodMap.put(2, 3);
        goodMap.put(3, 3);
        goodMap.put(4, 4);
        goodMap.put(5, 10);

        Map<Integer, Integer> evilMap = new HashMap<>();
        evilMap.put(0, 1);
        evilMap.put(1, 2);
        evilMap.put(2, 2);
        evilMap.put(3, 2);
        evilMap.put(4, 3);
        evilMap.put(5, 5);
        evilMap.put(6, 10);

        Integer goodSum = 1;
        Integer evilSum = 1;

        for (int i = 0; i < goodForces.length; i++) {
            goodSum += Integer.parseInt(goodForces[i]) * goodMap.get(i);
        }
        for (int i = 0; i < evilForces.length; i++) {
            evilSum += Integer.parseInt(evilForces[i]) * evilMap.get(i);
        }

        if (goodSum == evilSum) {
            return "Battle Result: No victor on this battle field";
        }


        return goodSum > evilSum ? "Battle Result: Good triumphs over Evil" : "Battle Result: Evil eradicates all trace of Good";
    }
}
