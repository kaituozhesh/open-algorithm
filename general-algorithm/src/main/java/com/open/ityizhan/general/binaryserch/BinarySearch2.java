package com.open.ityizhan.general.binaryserch;

/**
 * 递归实现二分查找法
 *
 * @ClassName : BinarySearch2
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-27 10:01
 * @Version: 1.0.0
 */
public class BinarySearch2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 222, 333, 444, 555, 666, 777, 888, 999};
        System.out.println(search(arr, 33));
    }

    public static int search(int[] arr, int num) {
        return search(arr, 0, arr.length - 1, num);
    }

    private static int search(int[] arr, int l, int r, int num) {
        if (l > r) return -1;
        int mid = l + (r - l) / 2;
        if (arr[mid] == num) {
            return mid;
        } else if (arr[mid] > num) {
            return search(arr, l, mid - 1, num);
        }
        return search(arr, mid + 1, r, num);
    }

}
