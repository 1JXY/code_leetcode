package com.jiang.NO17;

import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

        String[] numStr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "tuv", "wxyz"};

        backTracking(numStr, digits, 0);
        return result;
    }

    StringBuilder temp = new StringBuilder();
    private void backTracking(String[] numStr, String digits, int index) {
        if (index == digits.length()){
            result.add(temp.toString());
            return;
        }
        String str = numStr[(int)digits.charAt(index) - 48];
        for (int a =0; a < str.length(); a++){
            temp.append(str.charAt(a));
            backTracking(numStr, digits, index + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings = solution.letterCombinations("23");
        System.out.println(strings);
    }
}
