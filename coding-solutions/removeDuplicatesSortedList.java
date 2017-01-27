/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    ListNode curr = a;
	    while(curr.next != null){
	        if(curr.val == curr.next.val){
	            curr.next = curr.next.next;
	        }else{
	            curr = curr.next;
	        }
	    }
	    return a;
	}
}
