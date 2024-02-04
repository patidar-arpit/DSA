package DoublyCircularLL;

public class TestDLL {
	
	public static void main(String[] args) {
		
		DoublyCircularLinkedList list =  new DoublyCircularLinkedList();
		list.addLast(100);
		list.addLast(200);
		list.addLast(300);

		list.addLast(400);
		list.addLast(500);
		list.display();
		list.addFirst(50);
		list.addFirst(25);
		list.display();
		System.out.println(list.size);
		list.insert(1, 200);
		list.insert(9, 1000);
		list.display();
		list.insert(5,250);
		list.display();
        
		System.out.println(list.remove(5));
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());


		list.display();
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		System.out.println(list.removeLast());
		
         System.out.println(list.size);//0 after this it gives error 

	}

}
