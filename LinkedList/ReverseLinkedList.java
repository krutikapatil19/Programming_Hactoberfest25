class Node{                                                             //we defined what a node in a linked list looks like 
    int val;                                                            //value stored in the box.
    Node next;                                                          //A pointer to the next box. If there's no box , then its null.
    Node(int val) {                                                     //Constructor 
        this.val = val;         
    }                                                
}

public class ReverseLinkedList {
    Node head;

    //Method to add a node at the end
    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Iterative approach to reverse the list
    public void reverseIterative(){
    if(head == null ||head.next == null){
        return;
    }

    Node prevNode = head;
    Node currNode = head.next;

    while(currNode!= null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        //update
        prevNode = currNode;
        currNode = nextNode;
    }
    head.next = null;
    head = prevNode;
}

    //helper method to print list
    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(5);
        list.addLast(10);

        //Print original list
        System.out.println("Original list : ");
        list.printList();

        //Reverse the list
        list.reverseIterative();

        //Print reversed list
        System.out.println("Reversed list: ");
        list.printList();
    }
}

    