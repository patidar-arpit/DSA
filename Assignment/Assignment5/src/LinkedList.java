
class Node{
	public  int data;
	public  Node next;
	
	public Node(int data) {
		this.data= data;
		this.next=null;
	}
}

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void addLast(int data) {
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			tail = temp;
			
		}
		else {
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next=temp;
			tail = temp;
			
		}
		size++;
	}
	
	public void addFirst(int data) {
		Node temp = new Node(data);
		if(head ==null) {
			head = temp;
			tail = temp;
		}
		else {
			temp.next=head;
			head = temp;
		}
		size++;
		
	}
	
	public void insert(int pos,int value) {
		
		if(pos <1 || pos >size+1) {
			throw new RuntimeException("Invalid position");
		}
		if(pos==1) {
			addFirst(value);
		}
		else if(pos == size+1) {
			addLast(value);
		}
		
		else {
			Node newNode = new Node(value);
			Node currNode = head;
			int i = 1;
			while(i<pos-1) {
			   currNode = currNode.next;
			   i++;
			}
			
			newNode.next = currNode.next;
			currNode.next = newNode;
			size++;
		    
		}
		
	}
	
	public int removeFirst() {
		if(head == null)
			throw new RuntimeException("LL is empty");
		
		int res = head.data;
		head = head.next;
		size--;
		return res;
	}
	public int removeLast() {
		if(head == null)
			throw new RuntimeException("LL is empty");
		
		int res = tail.data;
		Node currNode = head;
		while(currNode.next!=tail) {
			currNode = currNode.next;
		}
		
		currNode.next = null;
		tail = currNode;
		size--;
		return res;
				
	}
	
	public int remove(int pos) {
		if(pos < 1 || pos >size) {
			throw new RuntimeException("Invalis pos");
			
		}
		
		if(pos==1)
			return  removeFirst();
		else if(pos==size)
			return removeLast();
		
		else {
			
			Node currNode = head;
			int i = 1;
			while(i<pos-1) {
			   currNode = currNode.next;
			   i++;
			}
			int res = currNode.next.data;
			currNode.next = currNode.next.next;
			size--;
			return res;
		}
	}
	
	
	public void  display() {
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+"->");
			currNode  = currNode.next;
		}
		
		System.out.println();
		
	}
	
	public int getSize() {
		return this.size;
	}
	
	
	
	
	

}
