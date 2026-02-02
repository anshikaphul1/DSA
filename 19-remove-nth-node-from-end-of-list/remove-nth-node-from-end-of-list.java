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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode t1=head;
        while(t1!=null){
            t1=t1.next;
            cnt++;
        }
        if(cnt==n){
            ListNode newnode=head.next;
            head.next=null;
            return newnode;
        }
        ListNode t2=head;
        int rev=0;
        while(t2.next!=null){
            if(rev==cnt-n-1){
                t2.next=t2.next.next;
            }
            else
            t2=t2.next;
            rev++;
        }
        return head;
    }
}