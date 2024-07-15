package org.example.linked_lists;

public class RemoveNthNodeFromEndOfList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/

    public static void main(String[] args) {
        
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // 1 2 3 4 5

        int count = 1;
        ListNode curren = head;
        while (curren.next != null) {
            count++;
            curren = curren.next;
        }

        if (n > count) return head;


        ListNode node = head;
        for (int i = 0; i < count - n - 1; i++) {
            node = node.next;
        }

        
        if(count == n) {
            head = head.next;
        } else if (node.next != null) {
            node.next = node.next.next;
        } else {
            return null;
        }
        

        return head;
    }

}
