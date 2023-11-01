package Test;

import Questions.BinarySearchTreeMode.BinarySearchTreeMode;
import Questions.BinarySearchTreeMode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class BinarySearchTreeModeTest {

    @Test
    public void testFindModeTest() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));

        BinarySearchTreeMode finder = new BinarySearchTreeMode();
        int[] actual = finder.findMode(root);

        int[] expected = new int[1];
        expected[0] = 2;

        Assert.assertEquals(expected[0], actual[0]);
    }

    @Test
    public void testFindModeTest2() {
        TreeNode root = new TreeNode(4,new TreeNode(2),new TreeNode(6) );
        root.getLeft().setLeft(new TreeNode(2));
        root.getLeft().setRight(new TreeNode(3));
        root.getRight().setLeft(new TreeNode(5));
        root.getRight().setRight( new TreeNode(7));

        BinarySearchTreeMode finder = new BinarySearchTreeMode();
        int[] actual = finder.findMode(root);

        int[] expected = {2};
        Assert.assertEquals(expected[0], actual[0]);
    }
}
