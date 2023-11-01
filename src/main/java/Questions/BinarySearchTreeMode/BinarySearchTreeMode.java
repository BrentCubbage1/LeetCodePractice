package Questions.BinarySearchTreeMode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeMode {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */

    private int maxCount;
    private int currentCount;
    private int previousValue;
    private List<Integer> modes;


    public int[] findMode(TreeNode root) {
        maxCount = 0;
        modes = new ArrayList<>();
        currentCount = 0;
        previousValue = Integer.MIN_VALUE;

        goThroughNode(root);

        int[] result = new int[modes.size()];
        for(int i = 0; i < modes.size();  i++){
            result[i] = modes.get(i);
        }

        return result;

    }


    public void goThroughNode(TreeNode node){
        if (node == null){
            return;
        }

        goThroughNode(node.left);
        if(node.val == previousValue){
            currentCount++;
        } else {
            currentCount = 1;
            previousValue = node.val;
        }

        if (currentCount > maxCount){
            maxCount = currentCount;
            modes.clear();
            modes.add(node.val);
        } else if (currentCount == maxCount){
            modes.add(node.val);
        }

        goThroughNode(node.right);


    }
}
