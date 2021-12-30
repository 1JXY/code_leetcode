package com.jiang.NO77;

import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<List<Integer>> result = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(n, k, 1);
        return result;
    }

    public void backTracking(int n, int k, int startIndex) {
        if(path.size() == k){
            result.add(path);
            System.out.println(path);
            System.out.println(result);
            return;
        }
        for (int a = startIndex; a <=n; a++){
            path.add(a);
            backTracking(n, k, a + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> list = solution.combine(4, 2);
        System.out.println(list);

    }
};

