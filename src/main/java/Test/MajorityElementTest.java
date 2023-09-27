package Test;

import Questions.MajorityElement.MajorityElement;
import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void testMajorityElement() {
        MajorityElement majorityElement = new MajorityElement();

        int[] nums1 = {2, 2, 1, 1, 2, 2, 2};
        Assert.assertEquals(2, majorityElement.majorityElement(nums1));

        int[] nums2 = {1, 2, 3};
        Assert.assertEquals(-1, majorityElement.majorityElement(nums2));

        int[] nums3 = {};
        Assert.assertEquals(-1, majorityElement.majorityElement(nums3));

        int[] nums4 = {1};
        Assert.assertEquals(1, majorityElement.majorityElement(nums4));


        int[] nums5 = {1, 2, 3, 4};
        Assert.assertEquals(-1, majorityElement.majorityElement(nums5));
}
}
