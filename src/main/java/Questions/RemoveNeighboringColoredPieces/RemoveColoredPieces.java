package Questions.RemoveNeighboringColoredPieces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveColoredPieces {


    public boolean winnerOfGame(String colors) {


/** O(n) notation (I think.) Two for loops but not nested. Still a slow implementation.
 **/
        List<String> aList = new ArrayList<>(Arrays.asList(colors.split("")));
        List<String> bList = new ArrayList<>(Arrays.asList(colors.split("")));
        Integer aCount = 0;
        Integer bCount = 0;

        for (int i = 1; i < aList.size() - 1; i++){
            String check = aList.get(i);
            String behind = aList.get(i - 1);
            String ahead = aList.get(i + 1);

            if (check.equals("A") && behind.equals("A") && ahead.equals("A")){
                aList.remove(i);
                i--;
                aCount++;
            }
        }
        for (int i = 1; i < bList.size() - 1; i++){
            String check = bList.get(i);
            String behind = bList.get(i - 1);
            String ahead = bList.get(i + 1);

            if (check.equals("B") && behind.equals("B") && ahead.equals("B")){
                bList.remove(i);
                i--;
                bCount++;
            }
        }

        return aCount > bCount;
    }

    /** Nested loop (O(n)^2 implementation. Runs too slow on giant test examples

     List<String> colorsList = new ArrayList<>(Arrays.asList(colors.split("")));
     boolean result = false;
     boolean play = true;
     String aOrB = "A";

     while (play) {
     play = false;

     for (int i = 1; i < colorsList.size() - 1; i++) {
     String check = colorsList.get(i);
     String behind = colorsList.get(i - 1);
     String ahead = colorsList.get(i + 1);

     if (check.equals(aOrB) && behind.equals(aOrB) && ahead.equals(aOrB)) {

     if (result) {
     result = false;
     } else if (!result) {
     result = true;
     }

     if (aOrB.equals("B")) {
     aOrB = "A";
     } else if (aOrB.equals("A")) {
     aOrB = "B";
     }

     play = true;
     colorsList.remove(i);
     i--;
     break;
     }

     }
     }

     return result;
     */
}
