package com.open.ityizhan.general.binaryserch;


/**
 * @ClassName : Ceil
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-27 12:43
 * @Version: 1.0.0
 */
public class Ceil {

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 5, 7, 7};
        System.out.println(ceil(arr, 5));
        System.out.println(ceil(arr, 6));
    }

    /**
     * > target : 返回最小值索引
     * == target: 返回最大索引
     *
     * @param arr
     * @param target
     * @return
     */
    public static int ceil(int[] arr, int target) {
        int upper = Upper.upper(arr, target);
        if (upper - 1 >= 0 && arr[upper - 1] == target) {
            return upper - 1;
        }
        return upper;
    }
}
