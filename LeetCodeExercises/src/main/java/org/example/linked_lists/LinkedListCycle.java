package org.example.linked_lists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListCycle {


    public static void main(String[] args) {
            
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();
        
        
        while(head != null) {
            if(nodes.contains(head)) {
                return true;
            }
            nodes.add(head);
            head = head.next;
        }
        
        return false;
        
    }
}
