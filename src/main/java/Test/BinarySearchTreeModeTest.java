package Test;

import Questions.BinarySearchTreeMode.BinarySearchTreeMode;
import Questions.BinarySearchTreeMode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class BinarySearchTreeModeTest {

    @Test
    public void testFindMode() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));

        BinarySearchTreeMode finder = new BinarySearchTreeMode();
        int[] actual = finder.findMode(root);

        int[] expected = new int[1];
        expected[0] = 2;

        Assert.assertEquals(expected[0], actual[0]);
    }
}
