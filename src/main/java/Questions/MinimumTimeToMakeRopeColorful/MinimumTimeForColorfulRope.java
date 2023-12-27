package Questions.MinimumTimeToMakeRopeColorful;

import java.util.ArrayList;
import java.util.List;

public class MinimumTimeForColorfulRope {


    /** SideNote: My Current Solution passes 113/113 tests on website but runs into time limit exceeded error.
                  error: Testcases passed, but took too long.
     */

    public int minCost(String colors, int[] neededTime) {

        //get a string of colors represented by letters. ex: abcaabc
        //the index of each letter matches the index of the neededTime int[].
        //need to remove baloons that are the same "color" and then add the neededTime up for each removal.


        //I plan to make a variable to hold the total time result.
        int result = 0;

        //My theory is that it would be easier to loop and remove excess colors if they were a list.
        //Also will make neededTime to a list. Reason is I will be removing from the colors and I need to size of neededTime to match after removal of indexes.
        List<Character> colorList = new ArrayList();
        for(Character c : colors.toCharArray()){
            colorList.add(c);
        }
        List<Integer> neededTimeList = new ArrayList();
        for (int i : neededTime){
            neededTimeList.add(i);
        }
        //Side note: I was trying to use Arrays.asList to populate these lists but it was not working as intended, have to research.

        //then, we loop through the chars in the color list, and if they are the same, remove the current one,
        //Also remove the neeededTime index. i--, and add to the result the needed time.
        //I need to modify this to check the lower time between the two before I do my removal.


        for (int i = 0; i < colorList.size() - 1; i++){
            //Check in the conditional if the neededTime for the first or second consecutive are higher before removal.
            if (colorList.get(i) == colorList.get(i + 1) && neededTimeList.get(i) <= neededTimeList.get(i + 1)){
                int timeToRemove = neededTimeList.get(i);
                result += timeToRemove;
                colorList.remove(i);
                neededTimeList.remove(i);
                i--;
            } else if (colorList.get(i) == colorList.get(i + 1) &&  neededTimeList.get(i) > neededTimeList.get(i + 1)){
                int timeToRemove = neededTimeList.get(i + 1);
                result += timeToRemove;
                colorList.remove(i + 1);
                neededTimeList.remove(i + 1);
                i--;
            }
        }

        return result;
    }
}

