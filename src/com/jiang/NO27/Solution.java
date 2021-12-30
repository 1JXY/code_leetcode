package com.jiang.NO27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] != val) {
                nums[idx++] = nums[a];
            }
        }
        return idx;
    }

    //快慢指针（双指针）
    public int removeElement_1(int[] nums, int val) {
        int fIndex = 0;
        int sIndex = 0;
        for (fIndex = 0; fIndex < nums.length; fIndex++) {
            if (nums[fIndex] != val) {
                nums[sIndex++] = nums[fIndex];
            }
        }
        return sIndex;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num[] = {3,2,2,3};
//        int result = solution.removeElement(num, 3);
        int result_1 = solution.removeElement_1(num, 3);
//        System.out.println(result);
        System.out.println(result_1);
    }
}
