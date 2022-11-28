package com.open.ityizhan.general.binaryserch;

import java.util.Arrays;

/**
 * @ClassName : LeetCode875
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-27 14:33
 * @Version: 1.0.0
 */
public class LeetCode875 {

    public static int minEatingSpeed(int[] piles, int H) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt(), mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (eatingTime(piles, mid) <= H) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private static int eatingTime(int[] piles, int k) {
        int res = 0;
        for (int pile : piles) {
//            res += pile % k == 0 ? pile / k : pile / k + 1;
            res +=  (pile + k - 1) / k;;
        }
        return res;
    }
}
