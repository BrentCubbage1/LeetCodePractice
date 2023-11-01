package Test;

import Questions.BinarySearchTreeMode.BinarySearchTreeMode;
import Questions.BinarySearchTreeMode.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class BinarySearchTreeModeTest {

    @Test
    public void testFindMode() {
        TreeNode root = new TreeNode(1);
        root.setRight(new TreeNode(2));
        root.setLeft(new TreeNode(2));

        BinarySearchTreeMode finder = new BinarySearchTreeMode();
        int[] result = finder.findMode(root);

        int[] expected = {2};
        assertArrayEquals(expected, result);
    }
}
