package org.example.linked_lists;

public class ReverseLinkedList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {

        ListNode a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        reverseList(a);

    }


    public static ListNode reverseList(ListNode head) {
        
        if(head == null) return null;
        
        ListNode newHead = new ListNode(head.val);
        
        //1 2 3 4
        //      h
        //      n
        //    p
        
        while (head.next != null) {
            ListNode previous = newHead;
            head = head.next;
            newHead = new ListNode(head.val, previous);
        }
        
        return newHead;
    }
}
