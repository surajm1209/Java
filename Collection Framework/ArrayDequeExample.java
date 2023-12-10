import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(30);
		System.out.println(ad);

		ad.addFirst(5);
		System.out.println(ad);

		ad.removeFirst();
		System.out.println(ad);

		ad.addLast(35);
		System.out.println(ad);

		ad.pollLast();
		System.out.println(ad);
		
		ArrayDeque ad1= ad.clone();
		System.out.println(ad1);

		System.out.println(ad1.contains(30));

		ad1.clear();
		System.out.println(ad1);
	}

}
