package com.open.ityizhan.general.recursion;

/**
 * 1. 通过数组求和了解递归
 *
 * @ClassName : SumArray
 * @Description : 数组求和
 * @Author : 林俊豪
 * @Date: 2022-11-26 14:17
 * @Version: 1.0.0
 */
public class SumArray {


    public static int sum(int[] arr) {
        return sum(arr, 0);
    }

    /**
     * 计算 arr[ l ... n ) 这个区间内所有数字的和
     *
     * @param arr
     * @param l
     * @return
     */
    private static int sum(int[] arr, int l) {
        // 最基本问题的解
        if (l == arr.length) {
            return 0;
        }
        // 逐步缩小问题规模
        return arr[l] + sum(arr, l + 1);
    }

}
