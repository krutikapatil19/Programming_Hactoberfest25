class ListNode {                                                //node class to create linked list nodes
    int val;                                                    //value stored in the node
    ListNode next;                                              //pointer to the next node
    ListNode (int val) {this.val = val;}                        //constructor , when a new node is created , it stores the value
}

public class MiddleOfLinkedList {
    //function to find middle of Linked List 
    public static ListNode middleNode (ListNode head ){         //static is used , so that we can directly call it from main , without making an object.
        ListNode slow = head, fast = head;

        //while fast is not null
        while(fast != null && fast.next!= null ) {
            slow = slow.next;                                   //move one step
            fast = fast.next.next;                              //move 2 steps
        }
        return slow;                                            //slow is at the middle 
    }

    //Function to insert a new node at the end 
    public static ListNode insertEnd(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if(head == null) return newNode;                    
        ListNode temp = head;                                       
        while(temp.next != null) {                                          
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = null;                                  //declare only once
        head = insertEnd(head , 10);
        head = insertEnd(head, 12);
        head = insertEnd(head, 14);
        head = insertEnd(head,19);
        head = insertEnd(head,22);
        head = insertEnd(head, 30);

        ListNode mid = middleNode(head);
        System.out.println("Middle Node = " + mid.val);

    }
    
}
