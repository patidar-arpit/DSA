
class Node{
	public int data;
	public Node next;
	public Node prev;
    
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class DoublyLinkedList{

  Node head;
  Node tail;
  int size;


  public DoublyLinkedList(){
    head = null;
    tail = null;
    size = 0;
  }

  
   public void  addFirst(int data) {
		Node temp = new Node(data);
		if(head == null) {
        head = temp;
        tail = temp ;
        size++;
		}
		
		else{
         temp.next = head;
         temp.prev = null;
         head.prev = temp;
         head = temp;
        size++;
      }
	}
  public void  addLast(int data) {
		Node temp = new Node(data);
		if(head == null) {
        head = temp;
        tail = temp ;
        size++;
		}
		
		else{
        tail.next = temp;
        temp.prev = tail;
        temp.next  =null;
        tail = temp;
        size++;
      }
	}

  public void insert(int pos,int value){
    
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
			while(i<pos) {
			   currNode = currNode.next;
			   i++;
			}
			
      currNode.prev.next = newNode;
      newNode.prev = currNode.prev;
      newNode.next = currNode;
      currNode.prev = newNode;
      size++;
		
		}
		

  }

  public int removeFirst(){

    if(head == null)
			throw new RuntimeException("LL is empty");
    
    int res = head.data;
    size--;
    head = head.next;
    if(head!=null)
       head.prev =null;
    
    return res;
  }

  public int removeLast(){
    if(head == null)
			throw new RuntimeException("LL is empty");
    
    int res = tail.data;
    tail = tail.prev;
    if(tail!=null)
        tail.next = null;
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

  public void display(){
    Node currNode = head;
    if(head ==null)
        throw new RuntimeException("LL is empty");

    while(currNode!=null){
      System.out.print(currNode.data+" = ");
      currNode = currNode.next;
    }

  }

  public int getSize(){
    return size;
  }

}