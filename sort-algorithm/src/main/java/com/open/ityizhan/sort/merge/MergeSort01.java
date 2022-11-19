package com.open.ityizhan.sort.merge;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

import java.util.Arrays;

/**
 * 图例文档：https://www.processon.com/view/link/6370a8c15653bb3a84bc6da0
 *
 * @ClassName : MergeSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 20:35
 * @Version: 1.0.0
 */
public class MergeSort01 implements Sort {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Integer[] arr = SortUtility.generateRandomArray(10000, 10000);
            SortUtility.sortTest("MergeSort01", arr);
        }
    }


    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public <E extends Comparable<E>> void mergeSort(E[] arr, int l, int r) {

        if (l >= r) return;

        int mid = l + (r - l) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);
    }

    private <E extends Comparable<E>> void merge(E[] arr, int l, int mid, int r) {

        E[] temp = Arrays.copyOfRange(arr, l, r + 1);
        int i = l, j = mid + 1;

        for (int k = l; k <= r; k++) {
            if (i > mid) {
                arr[k] = temp[j - l];
                j++;
            } else if (j > r) {
                arr[k] = temp[i - l];
                i++;
            } else if (temp[i - l].compareTo(temp[j - l]) > 0) {
                arr[k] = temp[j - l];
                j++;
            } else {
                arr[k] = temp[i - l];
                i++;
            }
        }


    }
}
