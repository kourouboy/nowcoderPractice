package com.kourou.jianzhiOffer.Work_6_11_Day20;
import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode cur = pHead;
        ListNode head1 = new ListNode(-1);
        ListNode head2 = new ListNode(-1);
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while (cur != null){
            if (cur.val < x){
                temp1.next = new ListNode(cur.val);
                temp1 = temp1.next;
            }else {
                temp2.next = new ListNode(cur.val);
                temp2 = temp2.next;
            }
            cur = cur.next;
        }
        cur = head1;
        while (cur.next != null && cur.next.val != -1){
            cur = cur.next;
        }
        cur.next = head2.next;
        return head1.next;
    }
}