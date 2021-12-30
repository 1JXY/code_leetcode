package com.jiang.NO203;

class Solution {

    //使用原链表进行操作
    public ListNode removeElements(ListNode head, int val) {
        //链表的头结点操作与其他节点不同，需要单独进行处理
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                //pre = cur;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    //采用添加预先节点的方法，统一头节点与其他节点的处理方法
    public ListNode removeElements_1(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode preHead = new ListNode(-1, head);
        ListNode pre = preHead;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                pre = cur;
                cur = cur.next;
            }else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return preHead.next;
    }

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}