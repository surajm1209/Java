import java.util.Arrays;

public class ArraysCalss {
    public static void main(String[] args) {
		//Creating an empty array
		int[] a= new int[4];		
		for(int elem:a)
		{
			System.out.print(elem);
		}
		System.out.println();
		
		//Adding the values in array using Fill() methond
        Arrays.fill(a,5);
		for(int elem:a)
		{
			System.out.print(elem);
		}
		System.out.println();
		
		//Adding the values in array at specified location using Fill() methond
		int[] ar= {1,2,0,0,0,4,5};
		Arrays.fill(ar, 2, 5, 10);
		for(int elem:ar)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		//Sorting an array in ascending order
		int[] arr= {20,30,50,10,25,60};
		Arrays.sort(arr);
		for(int elem:arr)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		//Searrching array with binary search
		int res=Arrays.binarySearch(arr, 30);
		System.out.println(res);
		
		
	}
}
