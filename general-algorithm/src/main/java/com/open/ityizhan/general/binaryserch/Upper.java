package com.open.ityizhan.general.binaryserch;

/**
 * 查找大于target的最小值对应的索引
 *
 * @ClassName : Upper
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-27 12:21
 * @Version: 1.0.0
 */
public class Upper {

    public static void main(String[] args) {
        int[] arr = {23, 56, 65, 69, 72, 89, 96, 99};
        System.out.println(upper(arr, 60));
    }

    /**
     * 查找大于 target 的最小值
     *
     * @param arr
     * @param target
     * @return
     */
    public static int upper(int[] arr, int target) {

        int l = 0, r = arr.length, mid;
        // 在 arr[l, r] 中寻找解
        while (l < r) {
            mid = l + (r - l) / 2;
            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
