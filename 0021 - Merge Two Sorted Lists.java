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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode startNode = null;
        ListNode currentNode = null;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    if (currentNode == null) {
                        currentNode = new ListNode(list1.val);
                        startNode = currentNode;
                        list1 = list1.next;
                        continue;
                    }

                    currentNode.next = new ListNode(list1.val);
                    currentNode = currentNode.next;
                    list1 = list1.next;
                } else {
                    if (currentNode == null) {
                        currentNode = new ListNode(list2.val);
                        list2 = list2.next;
                        startNode = currentNode;
                        continue;
                    }
                    currentNode.next = new ListNode(list2.val);
                    currentNode = currentNode.next;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                if (currentNode == null) {
                    currentNode = new ListNode(list1.val);
                    list1 = list1.next;
                    startNode = currentNode;
                    continue;
                }

                currentNode.next = new ListNode(list1.val);
                currentNode = currentNode.next;
                list1 = list1.next;

            } else {
                if (currentNode == null) {
                    currentNode = new ListNode(list2.val);
                    startNode = currentNode;
                    list2 = list2.next;
                    continue;
                }

                currentNode.next = new ListNode(list2.val);
                currentNode = currentNode.next;
                list2 = list2.next;
            }
        }

        return startNode;
    }

}
