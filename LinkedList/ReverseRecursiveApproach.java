class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
public class ReverseRecursiveApproach {
    
        Node head;
        Node tail;

        //Method to add node at the end
        public void addLast(int val) {
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //Recursive reverse function
        public void reverse(Node node) {
            if (node == tail) {
                head = tail;
                return;
            }
            reverse(node.next);

            tail.next = node;               //make tail point back to currect node
            tail = node;                    //update tail
            tail.next = null;               //cut forward link
        }

        //Print the linked list
        public void printList() {
            Node temp = head;
            while(temp!= null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        public static void main(String[] args) {
            ReverseRecursiveApproach list = new ReverseRecursiveApproach();
            list.addLast(1);
            list.addLast(5);
            list.addLast(15);
            list.addLast(20);

            System.out.println("Original list : ");
            list.printList();

            list.reverse(list.head);

            System.out.println("Reversed List:");
            list.printList();
        }
    }
