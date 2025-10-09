class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveCycle {

    //Function to detect and remove cycle 
    public static void removeCycle(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head, fast =head;

        //Step1: detect cycle using Floyd's Algorithm
        boolean hasCycle = false;
        while(fast!= null && fast.next != null) {
            slow = slow.next;                           //move 1 step
            fast = fast.next.next;                      //move 2 steps

            if (slow == fast) {
                hasCycle = true;                        //cycle detected , as both slow and fast pointer meets
                break;
            }
        }

        if(!hasCycle) return;                           //no cycle -> nothing to remove 

    
        //Step 2: Find the start of cycle 

        slow = head;                                    //put one pointer at head node
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
    

        //now slow (or fast) is at the START of the cycle -how i have doubt 

        //Step3 : Find the node just before the start of the cycle - so it can be pointed to null , to end the cycle. 

        //Traversing only the cycle
        ListNode temp = slow;                            //slow is at the start of cycle.
        while (temp.next != slow) {                      //move till the node , whose next is cycle start(slow) , it basically means when the cycle is traversed again from the starting point of cyle , so we get to know the last node , whose .next can be finally be set to null
            temp = temp.next;
        }

        //Step 4 : Break the Cycle
        temp.next = null;
        }
    
    
        public static void main(String[] args) {

            //Create linked list
            ListNode head = new ListNode(1);
            head.next= new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            //Create a cycle (5 -> 3)
            head.next.next.next.next.next = head.next.next;

            //Call removeCycle
            RemoveCycle.removeCycle(head);

            //print the list to check cycle removal
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
    }

