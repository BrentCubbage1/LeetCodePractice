package Test;

import Questions.MinimumTimeToMakeRopeColorful.MinimumTimeForColorfulRope;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumTimeForColorfulRopeTest {


    @Test
    public void testMinCost() {
        MinimumTimeForColorfulRope minimumTimeForColorfulRope = new MinimumTimeForColorfulRope();

        // Test case 1: Basic test case
        String colors1 = "abcaabc";
        int[] neededTime1 = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(4, minimumTimeForColorfulRope.minCost(colors1, neededTime1));


        String colors2 = "abcdefg";
        int[] neededTime2 = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(0, minimumTimeForColorfulRope.minCost(colors2, neededTime2));


        String colors3 = "aaabbbccc";
        int[] neededTime3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(27, minimumTimeForColorfulRope.minCost(colors3, neededTime3));


        String colors4 = "aaabbbccc";
        int[] neededTime4 = {1, 1, 1, 2, 2, 2, 3, 4, 4};
        assertEquals(13, minimumTimeForColorfulRope.minCost(colors4, neededTime4));

    }
}
