class Solution {
       public int removeElement(int[] nums, int val) {
        int k = 0; // count unmatched values
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return  k;
    }
}