package com.open.ityizhan.general.recursion;

import com.open.ityizhan.general.recursion.entity.ListNode;

/**
 * 2. 删除链表中所有指定元素
 *
 * @ClassName : RemoveElements
 * @Description :
 * @Author : 林俊豪
 * @Date: 2022-11-26 15:04
 * @Version: 1.0.0
 */
public class RemoveElements {

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        ListNode res = removeElements(head, 6);
        System.out.println(res);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

}
