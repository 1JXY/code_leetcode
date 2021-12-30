package com.jiang.NO78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<Integer> path = new ArrayList<>();
    ArrayList<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int startIndex = 0;
        //result.add(new ArrayList<>(path));
        backTracking(nums, startIndex);
        return result;
    }

    private void backTracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(path));
        if (startIndex > nums.length){
            //result.add(new ArrayList<>(path));
            return;
        }
        for (int a = startIndex; a < nums.length; a++){
            path.add(nums[a]);
            backTracking(nums, a + 1);
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] num = {1,2,3};
        List<List<Integer>> subsets = solution.subsets(num);
        System.out.println(subsets);
    }
}

