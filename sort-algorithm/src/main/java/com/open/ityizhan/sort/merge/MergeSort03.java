package com.open.ityizhan.sort.merge;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

import java.util.Arrays;

/**
 * 归并排序优化二 : 对于小数据量转为插入排序
 * 归并排序优化三 : 优化merge操作中的数据拷贝
 * 图例文档：https://www.processon.com/view/link/6370a8c15653bb3a84bc6da0
 *
 * @ClassName : MergeSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 20:35
 * @Version: 1.0.0
 */
public class MergeSort03 implements Sort {


    public static void main(String[] args) {
        Integer[] arr = SortUtility.generateOrderedArray(10000);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Integer[] arr3 = Arrays.copyOf(arr, arr.length);
        SortUtility.sortTest("MergeSort01", arr);
        SortUtility.sortTest("MergeSort02", arr2);
        SortUtility.sortTest("MergeSort03", arr3);
        for (int i = 0; i < 100; i++) {
            Integer[] arr4 = SortUtility.generateRandomArray(100000, 100000);
            SortUtility.sortTest("MergeSort03", arr4);
        }
    }


    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        mergeSort(arr, 0, arr.length - 1, temp);
    }

    public <E extends Comparable<E>> void mergeSort(E[] arr, int l, int r, E[] temp) {

        if ((r - l) <= 15) {
            SortUtility.insertSort(arr, l, r);
            return;
        }

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid, temp);
        mergeSort(arr, mid + 1, r, temp);

        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            merge(arr, l, mid, r, temp);
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
