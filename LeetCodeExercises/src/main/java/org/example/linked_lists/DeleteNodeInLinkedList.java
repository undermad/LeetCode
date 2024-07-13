package org.example.linked_lists;

public class DeleteNodeInLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    // https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/
    
    public static void main(String[] args) {
        
        
        
    }
    
    
    // 1 2 3 4 5


    public static void deleteNode(ListNode node) {

        while (node.next != null) {
            node.val = node.next.val;
            if(node.next.next == null) break;
            node = node.next;
        }
        node.next = null;

    }





}


