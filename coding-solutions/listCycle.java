/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    ListNode next = a;
	    ListNode twoNext = a;
	    boolean isCycled = false;
	    while(twoNext != null && twoNext.next != null && next != null){
	        next = next.next;
	        twoNext = twoNext.next.next;
	        if(next == twoNext){
	            isCycled = true;
	            break;
	        }
	    }
	    if(!isCycled){
	        return null;
	    }else{
	        next = a;
	        while(next != twoNext){
	            next = next.next;
	            twoNext = twoNext.next;
	        }
	        return next;
	    }
	}
}
