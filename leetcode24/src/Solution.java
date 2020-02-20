class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}

public class Solution {
    public static void main(String args[]){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        printNode(swapPairs(node));
    }

    private static void printNode(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;

        int temp;
        temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;
        swapPairs(head.next.next);

        return head;
    }
}
