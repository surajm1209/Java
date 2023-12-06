public class StaticBlock {

	static int a;
	
	static {
		a=10;
		System.out.println("Static block1");
	}
	public static void main(String[] args) {
		System.out.println("Main method");

	}

}
