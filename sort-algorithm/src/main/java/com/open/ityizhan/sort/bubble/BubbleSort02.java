package com.open.ityizhan.sort.bubble;

import com.open.ityizhan.sort.Sort;
import com.open.ityizhan.sort.SortUtility;

/**
 * 冒泡排序优化一：设置一个标识（flag），当每轮比较后判断是否有改变，如没有发生改变表示已经有序，则可以结束比较了。
 *
 * @ClassName : BubbleSort01
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-17 19:59
 * @Version: 1.0.0
 */
public class BubbleSort02 implements Sort {


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            Integer[] arr = SortUtility.generateRandomArray(1000, 1000);
            SortUtility.sortTest("BubbleSort02", arr);
        }
    }

    @Override
    public <E extends Comparable<E>> void sort(E[] arr) {

        int len = arr.length;

        // flag 取值不同 以及 不同循环的写法

/*        boolean flag = true;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    flag = false;
                    SortUtility.swap(arr, j, j + 1);
                }
            }
            if (flag) {
                break;
            } else {
                flag = true;
            }
        }*/

        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    flag = true;
                    SortUtility.swap(arr, i, i + 1);
                }
            }
        } while (flag);

    }
}
