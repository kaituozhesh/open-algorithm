package com.open.ityizhan.sort.shell;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

/**
 * 图例文档：https://www.processon.com/view/link/6372055ee401fd43fe8e5452
 *
 * @ClassName : ShellSort
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 20:26
 * @Version: 1.0.0
 */
public class ShellSort implements Sort {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            SortUtility.sortTest("ShellSort", arr);
        }
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        int len = arr.length, h = len / 2;

        while (h > 0) {

            for (int i = h; i < len; i++) {
                E temp = arr[i];
                int j = i;
                for (; j - h >= 0 && temp.compareTo(arr[j - h]) < 0; j -= h) {
                    arr[j] = arr[j - h];
                }
                arr[j] = temp;
            }

            h /= 2;
        }

    }
}
