package com.open.ityizhan.sort.merge;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

import java.util.Arrays;

/**
 * 自底向上的归并排序-优化
 * 图例文档：https://www.processon.com/view/link/6370a8c15653bb3a84bc6da0
 *
 * @ClassName : MergeSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 20:35
 * @Version: 1.0.0
 */
public class MergeSort05 implements Sort {


    public static void main(String[] args) {
       /* for (int i = 0; i < 100; i++) {
            Integer[] arr = SortUtility.generateRandomArray(100000, 10000);
            SortUtility.sortTest("MergeSort05", arr);
        }*/
        Integer[] arr = SortUtility.generateRandomArray(100000, 10000);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        SortUtility.sortTest("MergeSort04", arr);
        SortUtility.sortTest("MergeSort05", arr2);
    }


    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        mergeSort(arr, 0, arr.length - 1, temp);
    }

    public <E extends Comparable<E>> void mergeSort(E[] arr, int l, int r, E[] temp) {

        if (l >= r) return;
        int len = arr.length;
        for (int sz = 1; sz < arr.length; sz *= 2) {
            for (int i = 0; i + sz < len; i += sz + sz) {
                if (arr[i + sz - 1].compareTo(arr[i + sz]) > 0) {
                    merge(arr, i, i + sz - 1, Math.min(i + sz + sz - 1, len - 1), temp);
                }
            }
        }

    }

    private <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r, E[] temp) {
        System.arraycopy(arr, l, temp, l, r - l + 1);

        int i = l, j = mid + 1;

        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j++];
            } else if (j > r) {
                arr[k] = temp[i++];
            } else if (temp[i].compareTo(temp[j]) > 0) {
                arr[k] = temp[j++];
            } else {
                arr[k] = temp[i++];
            }
        }


    }
}
