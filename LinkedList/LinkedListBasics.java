//Node class 
class Node {
    int data;                              //value of the node
    Node next;                             //reference to the next node in the list

    Node(int data) {
        this.data = data;                  //assign data to the current node
        this.next = null;                  //assume there is no next node, means 
    }
}

//LinkedList class 
public class LinkedListBasics {
    Node head;

    //Insert at end
    public void insertEnd(int data){
    Node newNode = new Node(data);          //create a new node

    if(head==null){                         //if the list is empty, new node becomes head.
        head = newNode;
        return;
    }
    Node temp = head;                       //If LL is not empty, then start from head 
    while(temp.next != null){               //traverse till end , when temp.next is null.
        temp = temp.next;
    }
    temp.next = newNode;
}

    //Insert at start 
    public void insertStart(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        else {
            newNode.next = head;
            head = newNode;
            //newNode.next
        }
    }

    //Insert at a given index
    public void insertAtIndex(int index, int data){
        Node newNode = new Node(data);
        if(index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node temp = head;
        int count = 0;
        //Traverse until (index-1)th node
        while(temp != null && count<index-1){
            temp = temp.next;
            count++;
          }

          //If index is out of range
          if(temp == null){
            System.out.println("Index out of range");
            return;
          }
          //Insert node
          newNode.next= temp.next;
          temp.next = newNode;

    }

    //Deletion of head node
    public void deleteStart(){
    if(head == null){
        System.out.println("List is empty.");
    }
    head = head.next; 
    }

    //deletion of last node
    public void deleteTail(int val){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        if(head.next == null){              //only one node
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){     //go till 2nd last node (the node whose next.next is null).
            temp = temp.next;
        }
        temp.next = null;
    }

    //Delete at given index
    public void deleteAtIndex(int index){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        if(index == 0){                 //delete head
            head = head.next;
            return;
        }

        Node temp = head;
        int count = 0;
        while(temp != null && count < index-1){
            temp = temp.next;
            count++;
        }
        if(temp == null || temp.next == null){
            System.out.println("Index out of range.");
            return;
        }
        temp.next = temp.next.next;


    }

    //Print LinkedList
    public void display() {
        Node temp = head;                  //we assign head to temp , for traversal from head to tail
        while(temp != null) {              //traverse until temp is not null
            System.out.print(temp.data + " -> ");
            temp = temp.next;              //after printng the current node data , move temp to the next node
        }
        System.out.println("null");
    }

    //Main function
    public static void main(String[] args) {
        LinkedListBasics list = new LinkedListBasics();
        list.insertStart(10);
        list.insertEnd(20);
        list.insertStart(30);
        list.insertAtIndex(2,24);

        list.deleteStart();
        list.deleteAtIndex(1);

        list.display();
    }
}