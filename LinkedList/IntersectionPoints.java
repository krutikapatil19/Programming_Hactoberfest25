class ListNode {                            //node in the linked list 
    int val;                                //value of the node
    ListNode next;                          //pointer/reference to next node

    ListNode(int val) {                     //constructor to create a node
        this.val = val;                     //assigns the given value to this node
        this.next = null;                   //Initially , its not pointing to any node
    }
}

public class IntersectionPoints {

    //Slow and fast pointer approach 
    
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //First , check if the LinkedList is empty 
        if (headA == null || headB == null) return null;

        ListNode temp1 = headA;         //Start at A
        ListNode temp2 = headB;         //Start at B


        //Keep going until they meet (or both of them becomes null)
        while (temp1 != temp2) {
            //Redirect logic - end of A -> go to B, end of B -> go to head of A
            temp1 = (temp1 == null) ? headB : temp1.next;
            temp2 = (temp2 == null) ? headA : temp2.next;
        }
        return temp1;                      //It will give either intersection point or null
    }

    //To print a list
    public static void printList(ListNode head, String name) {               
        System.out.print(name + ": ");
        ListNode current = head;
        int count = 0;
        while (current != null && count < 10) {             //count < 10 : its just a limit , to avoid running of an infinite loop , in the case where there exists a cycle in the linkedlost.
            System.out.print(current.val);
            current = current.next;
            if (current != null)
            System.out.print(" -> ");
            count ++;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //Creating two linked lists

        //List A : 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        //List B : 9 -> 8
        ListNode headB = new ListNode(9);
        headB.next = new ListNode(8);

        //Common in both : 4 -> 5
        ListNode common = new ListNode(4);
        common.next= new ListNode(5);

        //Attach common part
        headA.next.next.next = common;          //1 -> 2 -> 3 -> 4 -> 5
        headB.next.next = common;               //9 -> 8 -> 4 -> 5
        
        //Find intersection
        ListNode result = getIntersectionNode(headA, headB);

        if(result != null)
            System.out.println("Intersection at node with value: " + result.val);
        else 
            System.out.println("No intersection found.");
    }

}