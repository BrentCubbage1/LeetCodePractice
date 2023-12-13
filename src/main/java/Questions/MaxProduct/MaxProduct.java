package Questions.MaxProduct;

import java.math.BigInteger;

public class MaxProduct {


    public int maximumProduct(int[] nums){
    int highestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int value1 = nums[i] - 1;

            for (int j = i + 1; j < nums.length; j++) {
                int value2 = nums[j] - 1;

                int maxValue = value1 * value2;

                if (maxValue > highestNumber) {
                    highestNumber = maxValue;
                }

            }
        }

        return highestNumber;

        /** this is an alternate solution which is done by using Arrays.sort to sort the numbers in order then just grabbing the last two elements.
         * I prefer this method to my implementation due to no nested loop and cleaner look.
         *
         *  public int maxProduct(int[] nums) {
         *         Arrays.sort(nums);
         *         int x = nums[nums.length - 1];
         *         int y = nums[nums.length - 2];
         *         return (x - 1) * (y - 1);
         *     }
         */

    }
}
