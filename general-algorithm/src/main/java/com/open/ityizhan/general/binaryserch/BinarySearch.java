package com.open.ityizhan.general.binaryserch;

/**
 * 二分查找法的非递归实现
 *
 * @ClassName : BinarySearch
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-27 09:44
 * @Version: 1.0.0
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 222, 333, 444, 555, 666, 777, 888, 999};
        System.out.println(search(arr, 33));
    }

    public static int search(int[] arr, int num) {
        int l = 0, r = arr.length - 1, mid;
        // 在 arr[ l , r ] 的范围中查找 num
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int search2(int[] arr, int num) {
        int l = 0, r = arr.length, mid;
        // 在 arr[ l , r ) 的范围中查找 num
        while (l < r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
