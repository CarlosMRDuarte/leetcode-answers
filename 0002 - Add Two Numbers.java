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

import java.math.BigDecimal;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal n1 = new BigDecimal(fromNodeToString(l1));
        BigDecimal n2 = new BigDecimal(fromNodeToString(l2));

        BigDecimal sum = n1.add(n2);
        
        return fromStringToNode(sum.toPlainString());
    }

    private String fromNodeToString(ListNode node) {
        var builder = new StringBuilder();

        do {
            builder.append(node.val);
        } while ((node = node.next) != null);

        return builder.reverse().toString();
    }

    private ListNode fromStringToNode(String s) {
        ListNode currentNode = null;

        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            currentNode = new ListNode(num, currentNode);
        }

        return currentNode;
    }

}
