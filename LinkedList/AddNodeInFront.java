//Node class 
class Node {
    int data;                                   //value of the node
    Node next;                                  //reference to the next node in the list

    Node(int data) {
        this.data = data;                       //assign data to the first node
        this.next = null;                       //assume there is no next node, means wehen new node is created, the value gets assigned
    }
}

//Linked List Class
public class AddNodeInFront {
    Node head;

    //Insert in beginning
    public void insert(int data) {
        Node newNode = new Node(data);          //create a new node
        newNode.next = head;                    //the new node become head , and rest list move forward
        head = newNode;                         //updating head to new node , as it is inserted in front
    }


    //Print Linked List
    public void display() {
        Node temp = head;                       //assign head to temp, for traversal of linkedlist from head to tail
        while(temp != null) {                   //traversed until the next node(temp) is null 
            System.out.print(temp.data + " -> ");
            temp = temp.next;                   //update temp , to display nodes one by one 
        }
        System.out.print("null");
    }

    //Main method
    public static void main(String [] args) {
        AddNodeInFront list = new AddNodeInFront();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
        

    }
