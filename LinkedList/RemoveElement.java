//Node Structure
class ListNode {
    int val;                                                //value of the node
    ListNode next;                                          //reference to the next node

    ListNode (int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveElement {
    //function to remove all nodes with value = target
    public static ListNode removeElements (ListNode head, int target) {

        //Create dummy node that points to head
        //helps when head itself needs to be deleted
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode current = dummy;

        while(current.next != null) {                                           //traverse till the end of list 
            if(current.next.val == target ) {                                   //if current node has the target value -> skip it 
                current.next = current.next.next;
            } else {
                current = current.next;                                         //else just move ahead
            }
        }
        return dummy.next;
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(4);
            head.next.next.next = new ListNode(6);
            head.next.next.next.next = new ListNode(4);


            int target = 4;

            //calling function
            ListNode result = removeElements(head,target);      //remove target elements

            //Print updated List
            while(result != null){
                System.out.print(result.val+ " ");
                result = result.next;
            }
        }

    }
    
    
    
