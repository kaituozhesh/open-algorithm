package com.open.ityizhan.sort.select;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

/**
 * 图例文档：https://www.processon.com/view/link/636faa950791290b4baf7551
 *
 * @ClassName : SelectSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-18 11:40
 * @Version: 1.0.0
 */
public class SelectSort01 implements Sort {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            SortUtility.sortTest("SelectSort01", arr);
        }
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        int len = arr.length, minIndex;
        for (int i = 0; i < len; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex].compareTo(arr[j]) > 0) {
                    minIndex = j;
                }
            }
            SortUtility.swap(arr, i, minIndex);
        }
    }
}
