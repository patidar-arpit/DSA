package DoublyCircularLL;
class Node{	
	Node prev;
	Node next;
	int data;
	
	public Node(int data) {
		prev= null;
		next = null;
		this.data = data;
	}
}
public class DoublyCircularLinkedList {
	
	Node head;
	Node tail;
    int size;
    
    public DoublyCircularLinkedList() {
    	head = null;
    	tail = null;
    	size = 0;
    }
    
    
    public void addFirst(int data) {
    	Node tempNode = new Node(data);
        if(head == null) {
        	head = tempNode;
        	tail = tempNode;
        	head.next = head;
        	head.prev = null;
        	size++;
            return;	
        }
        tempNode.next = head;
        head.prev = tempNode;
        head = tempNode;
        tail.next = head;
        size++;
       
    }
    
    public void addLast(int data) {
    	Node tempNode = new Node(data);
        if(head == null) {
        	head = tempNode;
        	tail = tempNode;
        	head.next = head;
        	head.prev = null;
        	size++;
            return;	
        }
        
        tail.next = tempNode;
        tempNode.prev = tail;
        tail =  tempNode;
        tail.next = head;
        size++;
    }
    
    public void insert(int pos ,int data) {
    	
    	if(pos<1 || pos>size+1)
    		throw new RuntimeException("Invalid pos");
    	
    	if(pos==1)
    		addFirst(data);
    	else if(pos == size+1)
    		addLast(data);
    	else {
    		Node newNode = new Node(data);
    		Node currNode = head;
    		int i = 1;
    		while(i<pos-1) {
    			currNode = currNode.next;
    			i++;
    		}
    		
    		newNode.next = currNode.next;
    		currNode.next = newNode;
    		newNode.prev = currNode;
    		newNode.next.prev = newNode;
    		size++;
    		
    		
    	}
    }
    
    public void display() {
    	Node currNode = head;
    	if(currNode == null)
    		 throw new RuntimeException("LL is empty");
    	
    	do {
     		System.out.print(currNode.data+" ");
    	     currNode = currNode.next;
    	     
    	}while(currNode != head);
    	System.err.println();
    }
    
	public int removeFirst() {
		if(head == null)
   		  throw new RuntimeException("LL is empty");
		
		int res = head.data;
		
		if(head ==tail) {
			head =null;
			tail=null;
			size--;
			return res;
		}
		head = head.next;
		head.prev = null;
		size--;
		return res;
		
	}
    
	public int removeLast() {
		if(head == null)
   		  throw new RuntimeException("LL is empty");
		
		int res = tail.data;
		
		if(head ==tail) {
			head =null;
			tail=null;
			size--;
			return res;
		}
		
		tail = tail.prev;
		tail.next = head;
		size--;
		return res;
		
	}
	
	public int remove(int pos) {
		if(head==null)
			throw new RuntimeException("LL IS EMPTY");
		if(pos<1 || pos>size)
    		throw new RuntimeException("Invalid pos");
    	
    	if(pos==1)
    		return removeFirst();
    	else if(pos == size)
    		return removeLast();
    	else {
    		
    		Node currNode = head;
    		int i = 1;
    		while(i<pos) {
    			currNode = currNode.next;
    			i++;
    		}
    		int res = currNode.data;
    		currNode.prev.next = currNode.next;
    		currNode.next.prev = currNode.prev;
    		size--;
    		return res;
    		
    	}
		
	}
   
}
