package com.open.ityizhan.sort;

import com.sun.javafx.collections.SortHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @ClassName : SortUtility
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-16 09:05
 * @Version: 1.0.0
 */
public class SortUtility {
    private SortUtility() {
        throw new RuntimeException("");
    }

    private static final Map<String, Sort> sortMap = new HashMap<>();

    static {
    }

    /**
     * 生成长度为n的有序数组
     *
     * @param n
     * @return
     */
    public static Integer[] generateOrderedArray(int n) {
        return Stream.iterate(1, a -> a + 1).limit(n).toArray(Integer[]::new);
    }

    /**
     * 生成长度为n的随机数组 随机范围[0 , bound)
     *
     * @param n
     * @param bound
     * @return
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Random rnd = new Random();
        return Stream.iterate(1, a -> rnd.nextInt(bound)).limit(n).toArray(Integer[]::new);
    }

    /**
     * 判断数组是否有序
     *
     * @param arr
     * @return
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 测试排序
     *
     * @param sortName
     * @param arr
     */
    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {

        long startTime = System.nanoTime();
        sortMap.get(sortName).sort(arr);
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        if (!isSorted(arr))
            throw new RuntimeException(sortName + " failed");
        System.out.printf("%s , n = %d : %f s%n", sortName, arr.length, time);
    }

    public static <E extends Comparable<E>> void insertSort(E[] arr, int l, int r) {
        for (int i = l; i <= r; i++) {
            for (int j = i; j > l && arr[j - 1].compareTo(arr[j]) > 0; j--) {
                SortUtility.swap(arr, j - 1, j);
            }
        }
    }

    /**
     * 交换位置
     *
     * @param arr
     * @param i
     * @param j
     */
    public static <E extends Comparable<E>> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
