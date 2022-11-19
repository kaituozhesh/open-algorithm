package com.open.ityizhan.sort.insert;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

/**
 * 图例文档：https://www.processon.com/view/link/6370716ae0b34d37c4ed37b1
 *
 * @ClassName : InsertSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 20:12
 * @Version: 1.0.0
 */
public class InsertSort01 implements Sort {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            SortUtility.sortTest("InsertSort01", arr);
        }

    }


    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        int len = arr.length;

        for (int i = 1; i < len; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    SortUtility.swap(arr, j, j - 1);
                }
            }
        }

    }
}
