package com.open.ityizhan.sort.select;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

/**
 * 每论循环都找出 最小值 和 最大值 两个元素
 *
 * @ClassName : SelectSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-18 11:40
 * @Version: 1.0.0
 */
public class SelectSort02 implements Sort {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            SortUtility.sortTest("SelectSort02", arr);
        }
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        int len = arr.length, l = 0, r = len - 1, minIndex, maxIndex;
        while (l < r) {
            minIndex = l;
            maxIndex = r;
            if (arr[minIndex].compareTo(arr[maxIndex]) > 0) {
                SortUtility.swap(arr, minIndex, maxIndex);
            }

            for (int i = l + 1; i < r; i++) {
                if (arr[i].compareTo(arr[minIndex]) < 0) {
                    minIndex = i;
                } else if (arr[i].compareTo(arr[maxIndex]) > 0) {
                    maxIndex = i;
                }
            }

            SortUtility.swap(arr, l++, minIndex);
            SortUtility.swap(arr, r--, maxIndex);
        }
    }
}
