package com.open.ityizhan.sort.insert;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

import java.util.Arrays;

/**
 * 图例文档：https://www.processon.com/view/link/6370716ae0b34d37c4ed37b1
 *
 * @ClassName : InsertSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 20:12
 * @Version: 1.0.0
 */
public class InsertSort02 implements Sort {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println();
            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortUtility.sortTest("InsertSort01", arr);
            SortUtility.sortTest("InsertSort02", arr2);
        }
    }


    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        int len = arr.length;

        for (int i = 1; i < len; i++) {

            E temp = arr[i];
            int j = i;
            for (; j - 1 >= 0 && temp.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = temp;
        }

    }
}
