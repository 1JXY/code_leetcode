package com.jiang.NO216;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
class Solution {
    ArrayList<Integer> path = new ArrayList<>();
    ArrayList<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int startIndex = 1;
        int sum = 0;
        backTracking(k, n, startIndex, sum);
        return result;
    }

    public void backTracking(int k, int n, int startIndex, int sum) {
        //剪枝
        if (sum > n){
            return;
        }
        if (path.size() == k && sum == n){
            result.add(new ArrayList<>(path));
            return;
        }
        //剪枝
        for (int a = startIndex; a <= 9 - (k - path.size()) + 1; a++){
            sum += a;
            path.add(a);
            backTracking(k, n, a + 1, sum);
            sum -= a;
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum3(3, 7);
        System.out.println(lists);
    }

}
