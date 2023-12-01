/*===========================================
 
           *
         * * *
       * * * * *
     * * * * * * *
 =============================================*/
public class Pattern5 {
    public static void main(String[] args) 
	{
		int n=10;
		for(int i=0; i<n/2;i++)
		{
            for(int j=0; j<n;j++)
            {
				if(j>((n-1)/2)-i && j<((n-1)/2)+i)
                	System.out.print("* ");
                else 
                    System.out.print("  ");
            }
			System.out.print("\n");
		}
	}
}

