package simple_Queue;

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class QueueLL {

	Node front;
	Node tail;
	int size;

	public QueueLL() {

		front = null;
		tail = null;
		size = 0;
	}

	public void enqueue(int data) {

		Node newNode = new Node(data);
		if (front == null) {
			front = newNode;
			tail = newNode;
			size++;
			return;
		}

		tail.next = newNode;
		tail = newNode;
		size++;

	}

	public int dequeue() {

		if(isEmpty())
			throw new RuntimeException("Queue is empty");

		int res = front.data;
		front = front.next;
		size--;
		return res;
		
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty");

		int res = front.data;
		return res;
	}

	private boolean isEmpty(){
		if(front==null ||size ==0)
			 return true;
		return false;
	}

	public int getSize() {
		
		return size;
	}
	
	

}
