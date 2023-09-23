package Test;

import Questions.BinarySearch.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTests {

    @Test
    public void testSearch() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 5;
        BinarySearch binarySearch = new BinarySearch();

        int actual = binarySearch.search(nums, target);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void testSearchNotFound() {
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 6;
        BinarySearch binarySearch = new BinarySearch();

        int actual = binarySearch.search(nums, target);

        Assert.assertEquals(-1, actual);
    }
}
