package simple_Queue;

public class TestQueueLL {

	public static void main(String[] args) {
		
		 
		QueueLL q = new QueueLL();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		//q.enqueue(50);
		System.out.println(q.getSize());
		
		System.out.println(q.peek());
		System.out.println(q.peek());
		System.out.println(q.getSize());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.getSize());
		System.out.println(q.dequeue());
	}

}
