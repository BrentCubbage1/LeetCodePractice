package Test;

import Questions.TwoSum.TwoSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void twoSumTester(){
        //given
        TwoSum twoSum = new TwoSum();
        int[] numbers = new int[]{2, 4, 6, 22};
        int target = 8;
        int[] expected = new int[]{2, 0};
        //when
        int[] actual = twoSum.twoSum(numbers, target);
        //then
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
