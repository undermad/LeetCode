package org.example.linked_lists;


public class PalindromLinkedList {

    
    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));

        System.out.println(isPalindrome(head));
    }


    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        int[] arr = new int[count / 2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = head.val;
            head = head.next;
        }
        
        if(count % 2 != 0) head = head.next; 
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != head.val) return false;
            head = head.next;
        }
        
        
        return true;
    }
}
