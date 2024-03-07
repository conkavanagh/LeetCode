/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode currentNode = head.next;

        // traverse the list to find length, then we traverse again to find middle
        int length = 0;
        while(currentNode.next != null){
            currentNode = currentNode.next;
            length++;
        }

        int middleInd = length/2+1;
        currentNode = head;
        int currentInd = 0;
        while(currentInd < middleInd){
            currentNode = currentNode.next;
            currentInd++;
        }
        return currentNode;
    }
}