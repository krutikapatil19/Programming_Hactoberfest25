class Node{
    int val;                                    //value stored in the node
    Node next;                                  //reference to the next node
    Node (int val){                             //constructor to create a node
    this.val = val;
    }
}

public class MergedSortedLinkedList {           

    //Function to merge two sorted lists
    public static Node mergeTwoLists(Node list1 , Node list2) {
    Node dummy = new Node(-1);                  //dummy node as a helper , not part of final list
    Node tail = dummy;                          //tail keeps track of the last node in the merged list

    //compare nodes while both lists are not empty
    while (list1 != null && list2 != null){
        if(list1.val <= list2.val){             //pick smaller value from list1
        tail.next = list1;
        list1 = list1.next;                     //move list1 forward
    } else {                                    //else , pick from list2
        tail.next = list2;
        list2= list2.next;                      //move list2 forward
    }
    tail = tail.next;                           //move tail forward
    }

    //Attach whichever list is still remaining
    if (list1 != null)tail.next = list1;
    if (list2 != null)tail.next = list2;
    return dummy.next;                          //dummy was a fake node at the start(-1) , so the actual merged list starts from dummy.next
}

//Helper function to insert at end
public static Node insertEnd(Node head, int val) {
    Node newNode = new Node(val);
    if (head == null) {
        return newNode;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
    return head;
    }

    //helper function to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

public static void main(String[] args){
   Node list1 = null;                       //First sorted list
   list1 = insertEnd(list1, 10);
   list1 = insertEnd(list1, 12);
   list1 = insertEnd(list1, 16);

   Node list2 = null;
   list2 = insertEnd(list2, 5);
   list2 = insertEnd(list2, 6);
   list2 = insertEnd(list2, 9);


   System.out.println("list1: ");
   printList(list1);

   System.out.print("list 2: ");
   printList(list2);

   //Merge them
   Node merged = mergeTwoLists(list1, list2);                       //made the method mergeTwoLists static , so directly called it without creating an object

   System.out.print("Merged List: ");
   printList(merged);
}
}
