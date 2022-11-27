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

        if (arr.length == 0) {
            throw new IllegalArgumentException("Arr is empty");
        }
        int l = 0;
        int r = arr.length - 1;
        int mid = l + (r - l) / 2;
        while (true) {
            if (l > r) return -1;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                r = mid - 1;
                mid = l + (r - l) / 2;
            } else {
                l = mid + 1;
                mid = l + (r - l) / 2;
            }
        }
    }
}
