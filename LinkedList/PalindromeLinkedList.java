//Node class
class Node {
    int val;                                                           //value of the node            
    Node next;                                                         //refernce to next node
    Node(int data) {
        this.val = data;    
        this.next = null;
    }
}

public class PalindromeLinkedList {

    //Function to check if linked list is palindrome
    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null) return true;              //if there 0 or 1 node, its always palindrome

        //Find middle of list using fast and slow pointers
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;                                           //move slow by 1
            fast = fast.next.next;                                      //move fast by 2
        }
        //now slow is at middle of list 

        //Reverse second half of list
        Node prev = null;
        Node curr = slow;
        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        //now prev = head of reversed 2nd half

        //Comparing both halves (first half and reversed second half)
        Node first = head;
        Node second = prev;
        while(second != null) {
            if(first.val != second.val) return false;                   //is values not same -> not a palindrome
               first = first.next;
               second = second.next;                                
            }
            return true;                                                //if all values matched -> palindrome
                                                
    }
        public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

       if (isPalindrome(head)) {
        System.out.println("It's a Palindrome Linked list");
       } else {
        System.out.println("Not a Palindrome");
       }
    }
    
}
