/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode subtract(ListNode a) {
	    ListNode curr = a;
	    int length = 0;
	    while(curr.next != null){
	        length++;
	        curr = curr.next;
	    }
	    //Add 1 for last node
	    length = length + 1;
	    int nth = length-1;
	    curr = a;
	    for(int i=0; i<length/2; i++){
	        curr.val = findNthNode(a, nth).val - curr.val;
	        curr = curr.next;
	        nth--;
	    }
	    return a;
	}
	
	//Find nth node
	public ListNode findNthNode(ListNode head, int n){
	    ListNode node = head;
	    for(int i=0; i<n; i++){
	        node = node.next;
	    }
	    return node;
	}
	
	//reversed list
	public ListNode reversedList(ListNode head){
	    ListNode reversedPart = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = reversedPart;
            reversedPart = current;
            current = next;
        }
        return reversedPart;
	}
}
