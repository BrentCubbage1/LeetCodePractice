package Questions.ContinousArray;

import java.util.*;

public class ContinousArray {

    public int minOperations(int[] nums) {

        //Find the smallest number
        //Go through the list again and find the biggest number
        //If the biggest number is greater than smallest, change it to nums.length + minimum.
        //This does not account for making sure each number is unique.

        /** If we use a treeSet, it will sort by natural order.
        //The smallest number will be at element 0, the largest at nums.length - 1
        //Count backwards, if biggest - smallest != nums.length - 1,
        //element = nums.length - 1. + minumum - count;
        //I'm not sure if this covers all edge cases, but I'll start here. */


        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int num : nums){
            sortedArray.add(num);
        }

        Collections.sort(sortedArray);
        int count = 0;
        Integer minimum = sortedArray.get(0);
        Integer maximum = sortedArray.get(nums.length - 1);

        for (int i = nums.length - 1; i > 0; i--){
            Integer check = sortedArray.get(i);
            if (check - minimum > nums.length - 1){
                count++;
            }
        }
        return count;



//        TreeSet<Integer> numsSet = new TreeSet<Integer>();
//
//        for (int num : nums){
//            numsSet.add(num);
//        }
//
////        int count = 0;
////        Integer minimum = numsSet.first();
////        Iterator<Integer> loopThroughTree = numsSet.descendingIterator();
////
////        while (loopThroughTree.hasNext()){
////            Integer check = loopThroughTree.next();
////            if (check - minimum > nums.length - 1){
////                count++;
////            }
////        }
//
//
//        return count;
    }
}
