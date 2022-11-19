package com.open.ityizhan.sort.bubble;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

/**
 * @ClassName : BubbleSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 19:59
 * @Version: 1.0.0
 */
public class BubbleSort01 implements Sort {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            SortUtility.sortTest("BubbleSort01", arr);
        }
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        // arr[n - i, n) 已排好序，每轮通过冒泡在 arr[n - i - 1] 位置放上合适的元素

        int len = arr.length;

        // 当 j 起始位置不同的时候，相应的 循环结束条件也不同，为了跟画的图展示流程一致，下面使用j = 0 开始
        /*for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len - i; j++) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    SortUtility.swap(arr, j, j - 1);
                }
            }
        }*/

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    SortUtility.swap(arr, j, j + 1);
                }
            }
        }

    }
}
