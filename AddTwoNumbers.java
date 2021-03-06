 /**
 *You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 *Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *Output: 7 -> 0 -> 8
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        Node tmp1=l1.getHead();
        Node tmp2=l2.getHead();
        while(tmp1!=null)
        {
            tmp1.getData()=tmp1.getData()+tmp2.getData();
            tmp1=tmp1.getNext();
            tmp2=tmp2.getNext();
        }
    }
}
