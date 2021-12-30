package com.jiang.NO59;

import java.util.Arrays;

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int toop = n / 2;//转的圈数
        int startX = 0, startY = 0;//起始的位置
        int mid = n / 2;
        int offset = 1;//这个不是太懂
        int count = 1;

        while (toop != 0) {
            //每一轮都要给起始位置附上新的值
            int a = startY;
            int b = startX;
            //上行从左到右
            for (; a < startY + n - offset; ++a ) {
                result[startX][a] = count++;
            }
            //右列从上到下
            for (; b < startX + n - offset; ++b) {
                result[b][a] = count++;
            }
            //下行从右到左
            for (; a > startY; a--) {
                result[b][a] = count++;
            }
            //左列从下到上
            for (; b > startX; b--) {
                result[b][a] = count++;
            }
            toop--;
            startX++;
            startY++;
            offset += 2;// offset 控制每一圈里每一条边遍历的长度
        }

        if (n % 2 != 0) {
            result[mid][mid] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = solution.generateMatrix(19);
        for (int a = 0; a < matrix.length; a++) {
            System.out.println(Arrays.toString(matrix[a]));
        }
    }
}