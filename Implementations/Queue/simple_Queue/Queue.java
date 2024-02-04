package simple_Queue;

public class Queue {
	
	 private int front;
	 private int rear;
	 private int [] queue;
	
	
	 public Queue(){
	      queue = new int[5];
	      front = -1;
	      rear = -1;
	      
	 }
	 public Queue(int capacity){
	      queue = new int[capacity];
	      front = -1;
	      rear = -1;
	 }
	 
	 public void enqueue(int val) {
		 if(isFull())
			  throw new RuntimeException("Queue is full");
		 
		 if(isEmpty()) {
			front = 0;
			queue[++rear] = val;
		 }
		 
		 else {
			 queue[++rear] = val;
		}
		 
	 }
	 public int dequeue() {
		 
		 if(isEmpty()) {
			throw new RuntimeException("Queue is empty ");
		 }
		 
		 return queue[rear--];
	 }
	 public int peek() {
		 if(isEmpty()) {
				throw new RuntimeException("Queue is empty ");
		  }
		 return queue[front];
	 }
	 
	 private boolean isEmpty() {
	           if(rear==-1 && front==-1)
	        	   return true;
	           return false;
		}
	
	 private boolean isFull() {
		if(rear ==queue.length-1)
		    return true;
		
		return false;
      }
	 
	 public int getSize() {
		 return rear+1;
	 }

}
