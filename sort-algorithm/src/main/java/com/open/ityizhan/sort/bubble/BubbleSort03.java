package com.open.ityizhan.sort.bubble;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

import java.util.Arrays;

/**
 * @ClassName : BubbleSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 19:59
 * @Version: 1.0.0
 */
public class BubbleSort03 implements Sort {


    public static void main(String[] args) {
//
        for (int i = 0; i < 100; i++) {
            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            SortUtility.sortTest("BubbleSort03", arr);
        }
//        Integer[] arr = SortUtility.generateOrderedArray(1000);
//        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
//        Integer[] arr3 = Arrays.copyOf(arr, arr.length);
//        SortUtility.sortTest("BubbleSort01", arr);
//        SortUtility.sortTest("BubbleSort02", arr2);
//        SortUtility.sortTest("BubbleSort03", arr3);
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        int len = arr.length;
        int k;
        do {
            k = 0;
            // 从这次的排序可以发现，如果i 从 1 开始，那么循环结束条件中的 len - 1 就可以改为 len, 循环结束后的 len = k + 1 就可以改为 len = k;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    k = i;
                    SortUtility.swap(arr, i, i + 1);
                }
            }
            len = k + 1;
        } while (k > 0);

    }
}
