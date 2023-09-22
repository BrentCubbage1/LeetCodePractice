package Questions.BinarySearch;

public class BinarySearch {

    public int search(int[] nums, int target) {

            if (nums.length == 1){
                if (nums[0] == target){
                    return 0;
                } else {
                    return -1;
                }
            }

            int left = 0;
            int right = nums.length - 1;

            while (left <= right){
                int middle = (left + right) / 2;

                int checkedNum = nums[middle];

                if (checkedNum == target){
                    return middle;
                }

                if(checkedNum > target){
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }

            return -1;

        }
}
