class Node{
    int val;                                            //value stored in the node
    Node next;                                          //referece to the next node
    Node (int val){                                     //constructor to create a new node
        this.val = val;
        this.next = null;
    }
}
    public class RemoveNthNodeFromEnd {

    //Function to remove nth node from end
    public static Node removeNth(Node head, int n) {
        Node dummy = new Node(-1);                      //dummy node as a helper node , to point at the head, if head node is to be deleted
        dummy.next = head;
        

        Node fast = dummy;                              //used two pointers fast and slow , the fastpointer moves n+1 times ahead of the slow pointer
        Node slow = dummy;

        /* another approach , by using the length of the linked list , and doing n-1 , to remove that exact node from list
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        */

        //Move fast pointer n+1 steps ahead
        for(int i =0; i<= n; i++) {
            if(fast == null) return head;       //edge case : n>length
            fast = fast.next;
        }

        //Move both fast & slow until fast reaches end
        while (fast!= null) {
            fast = fast.next;
            slow = slow.next;
        }

        //delete the target node
        // Now slow is just before the node to delete
        slow.next = slow.next.next;
        return dummy.next;
    }

    //Helper function to insert at end 
    public static Node insertEnd(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //Helper function to print list 
    public static void printList(Node head) {
        Node temp = head;
        while(temp!= null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
        public static void main(String[] args){
        Node list = null;
        list = insertEnd(list, 14);
        list = insertEnd(list, 16);
        list = insertEnd(list, 20);
        list = insertEnd(list, 30);
        list = insertEnd(list, 54);


        System.out.println("Original list:");
        printList(list);

        list = removeNth(list,2);

        System.out.println("After Deletion:");
        printList(list);
    }
    
}
