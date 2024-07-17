package org.example.linked_lists;


public class MergeTwoSortedLists {


    public static void main(String[] args) {


    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head;
        if (list1.val >= list2.val) {
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }

        ListNode current = head;
        
        while (list1 != null && list2 != null) {
            if(list1.val >= list2.val) {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            } else {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }
        }
        
        while(list1 != null) {
            current.next = list1;
            current = current.next;
            list1 = list1.next;
        }
        
        while (list2 != null) {
            current.next = list2;
            current = current.next;
            list2 = list2.next;
        }
        
        return head;
    }


}
