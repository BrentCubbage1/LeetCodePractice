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

        //Didn't need a treeset because I can just sort an Array with Arrays.sort or Collections.sort a list.
        //Ok now I added a TreeSet to get the difference in size between the array and the set and add it to the total
        //This is intended to cover multiples that would need to be changed.



        ArrayList<Integer> sortedArray = new ArrayList<>();
        int count = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            int current = nums[i];
            int next = nums[i + 1];

            if (current == next){
                nums[i+1] = nums[i+1] +1;
                sortedArray.add(current);
                count++;
            } else {
                sortedArray.add(current);
            }
        }
        sortedArray.add(nums[nums.length - 1]);

        Integer minimum = sortedArray.get(0);

        for (int num : sortedArray){
            if (num - minimum > nums.length - 1){
                count++;
            }
        }
        return count ;



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
