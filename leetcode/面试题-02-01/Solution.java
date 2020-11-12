/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        // 注意：删除链表节点一定要注意要知道前置节点
        ListNode temp = head, prev = head;
        while(temp != null){
            if(!hashSet.contains(temp.val)){
                hashSet.add(temp.val);
                prev = temp;
                temp = temp.next;
                
            }else{
               prev.next = temp.next;
               temp = temp.next;
            }
        }
        return head;
    }
}