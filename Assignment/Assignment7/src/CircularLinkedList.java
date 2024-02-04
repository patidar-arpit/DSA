
class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;

	}
}

class CircularLinkedList {

	Node head;
	Node tail;
	int size;

	public CircularLinkedList() {
		head = null;
		tail = null;
		
	}

	public void addFirst(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			head.next = head;
			tail = temp;
			size++;
		}

		else {
			temp.next = head;
			head = temp;
			tail.next = head;
			size++;
		}
	}

	public void addLast(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			tail = temp;
			head.next = head;
			size++;
		}

		else {
			tail.next = temp;
			temp.next = head;
			tail = temp;
			size++;
		}
	}

	public void insert(int pos, int value) {

		if (pos < 1 || pos > size + 1) {
			throw new RuntimeException("Invalid position");
		}
		if (pos == 1) {
			addFirst(value);
		} else if (pos == size + 1) {
			addLast(value);
		}

		else {
			Node newNode = new Node(value);
			Node currNode = head;
			int i = 1;
			while (i < pos - 1) {
				currNode = currNode.next;
				i++;
			}

			newNode.next = currNode.next;
			currNode.next = newNode;
			size++;

		}

	}

	public int removeFirst() {

		if (head == null)
			throw new RuntimeException("LL is empty");
        
		int res = head.data;
		if (head == tail ) {
			head = null;
			tail = null;
			size--;
			return res;
		}
		
		
		head = head.next;
		tail.next = head;
		size--;

		return res;
	}

	public int removeLast() {
		if (head == null)
			throw new RuntimeException("LL is empty");

		int res = tail.data;
		if (head == tail) {
			head = null;
			tail = null;
			return res;
		}
		
		Node currNode = head;
		while (currNode.next != tail) {
			currNode = currNode.next;
		}

		tail = currNode;
		tail.next = head;
		size--;
		return res;

	}

	public int remove(int pos) {
		if (pos < 1 || pos > size) {
			throw new RuntimeException("Invalid pos");

		}

		if (pos == 1)
			return removeFirst();
		else if (pos == size)
			return removeLast();

		else {

			Node currNode = head;
			int i = 1;
			while (i < pos - 1) {
				currNode = currNode.next;
				i++;
			}
			int res = currNode.next.data;

			currNode.next = currNode.next.next;
			size--;
			return res;
		}
	}

	public void display() {
         
		if (head == null) {
			System.out.println("Empty");
			return;
		}

		Node currNode = head;

		do {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		} while (currNode != head);

		System.out.println();
	}

	public int getSize() {
		return size;
	}

}