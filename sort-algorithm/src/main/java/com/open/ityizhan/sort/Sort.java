package com.open.ityizhan.sort;

public interface Sort {

    <E extends Comparable<E>> void sort(E[] arr);

}
