class Node {
    int val;                                    //value inside the node
    Node next;                                  //reference to the next node 
    Node(int val) {
        this.val = val;                         //put value in the node 
        this.next = null;
    }
}
public class DetectCycle {
    //Function to check if cycle is present 
    public static boolean hasCycle(Node head) {
        Node slow = head;                                   //Initially slow pointer and fast pointer , both points towards head Node. 
        Node fast = head;                                   
        while(fast!= null && fast.next !=null){             //keep moving till fast reaches end
            slow = slow.next;                               //slow moves 1 step
            fast= fast.next.next;                           //fast pointer moves 2 steps
            if(slow == fast) return true;                   //if both meet -> cycle exists
        }
        return false;                                       //if fast reaches null , no cycle exists.
    }

    public static void main(String [] args) {
        //Creating nodes
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(10);
        Node n4 = new Node(16);
        Node n5 = new Node(26);

        //Connecting the nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;
    
    //Check cycle
    if(hasCycle(n1))
    System.out.println("Cycle exists.");
    else
        System.out.println("Cycle doesn't exist.");
    
    }
}
