public class ThrowsFromMain {

	public static void main(String[] args)throws Exception
	{
		System.out.println("Before sleepn");
		Thread.sleep(4000);
		System.out.println("after the nap");

	}

}
