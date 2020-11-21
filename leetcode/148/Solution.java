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
    public ListNode sortList(ListNode head) {
        //  巧妙的偷天换日
        if(head == null) return null;
        ArrayList<Integer> list = new ArrayList<>(50000);

        ListNode temp = head;

        while(temp != null){
            list.add(temp.val)å;
            temp = temp.next;
        }

        list.sort(Integer::compare);
       
        temp = head;
        for(int i = 0; i < list.size(); i ++){
          temp.val = list.get(i);
           temp = temp.next;
        }
        return head;
    }
}