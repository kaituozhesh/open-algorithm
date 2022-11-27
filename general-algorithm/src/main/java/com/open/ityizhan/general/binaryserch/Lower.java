package com.open.ityizhan.general.binaryserch;

/**
 * 查找小于查询值的最大值索引
 *
 * @ClassName : Lower
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-27 12:55
 * @Version: 1.0.0
 */
public class Lower {


    public static void main(String[] args) {
        int[] arr = {23, 56, 65, 69, 72, 89, 96, 99};
        System.out.println(lower(arr, 85));
    }

    public static int lower(int[] arr, int target) {
        int l = -1, r = arr.length - 1, mid;
        while (l < r) {
            mid = l + (r - l + 1) / 2;
            if (arr[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }
}
