import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedList ll1=new LinkedList();
		
		ll1.add(10);
		ll1.add("Java");
		ll1.add("JDK");
		ll1.add(20);
		System.out.println(ll1);
		
		// Adding element at Start-end
		ll1.addFirst("Suraj");
		System.out.println(ll1);

		//Adding element at specific location
		ll1.add(3, "Bilimora");
	    System.out.println(ll1);
	    
		// Adding element at End
	    ll1.addLast("Gujarat");    
	    System.out.println(ll1);
	        
	    LinkedList ll2=new LinkedList();    
	    ll2.add(10);
	    ll2.add(20);
	    ll2.add(40);
	    ll2.add(30);
	    ll2.add(40);
	    System.out.println(ll2);
	        
		//Works as the name indicates
	    System.out.println(ll2.getFirst());
	    System.out.println(ll2.getLast());
	    System.out.println(ll2.indexOf(40));
	    System.out.println(ll2.lastIndexOf(40));

	    //ll2.offerFirst(5);
		ll2.addFirst(5);
		System.out.println(ll2);

	    //ll2.offerLast(55);
		ll2.addLast(55);
		System.out.println(ll2);

		//Fetching the first element
	    System.out.println(ll2.peekFirst());
	    System.out.println(ll2);

		//Poping the Frist element
	    System.out.println(ll2.pollFirst());
	    System.out.println(ll2);
	}

}
