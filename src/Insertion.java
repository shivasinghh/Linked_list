// Inserting a node in linked list 

public class Insertion {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		public Node(int data) {       
			this.data=data;
			next=null;
		}
	}
	
	public void insertAtBegining(int data){
		
		Node newNode = new Node(data); 
		newNode.next = head;              // new node will point to head
		head = newNode;                   // move the head to point to new point
	}
	 
 public void insertAtPosition(Node prev,int data){
		
	Node newNode = new Node(data);
	if(prev == null) {                    // if list is empty
		head = newNode; 
		return;
	}
		newNode.next = prev.next;        // new and prev node will point to same node
		prev.next = newNode;             // prev node will point to new node 
	}
	
 public void insertAtEnd(int data){
	
	Node newNode = new Node(data);
	
	if(head==null) {                    // if list is empty
		head = newNode; 
		return;
	}
	 
	Node temp = head;                  // for traversing till last node
	while(temp.next!= null) {
		temp = temp.next;
	}
	temp.next = newNode;	
}

public void printlist() {               // to print the elements
	
	Node node = head;
	while(node!=null) {
		System.out.println(node.data);
		node = node.next;
	}	
}
	
public static void main(String[] args) {
		
	Insertion linkedList = new Insertion();
		
	Node firstNode = new Node(1);
	linkedList.head= firstNode;
	Node secondNode = new Node(2);
	firstNode.next = secondNode;
	Node thirdNode = new Node(3);
	secondNode.next = thirdNode;
	
	linkedList.insertAtEnd(9);
	linkedList.insertAtBegining(2);
	linkedList.insertAtPosition(secondNode,6);	
		
    linkedList.printlist();
	}
}
