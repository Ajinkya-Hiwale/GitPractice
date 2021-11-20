package Pages;

public class HomePage {
	
	public static void main(String args[])
	{
		
		
		

		Integer arr1[]=new Integer[] {1,9,10,11};
		Integer arr2[]=new Integer[] {2,4,6,8};
		Integer arr3[]=new Integer[8];
		
		int j=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]<arr2[i])
			{
				
				arr3[j]=arr1[i];
				arr3[j+1]=arr2[i];
				j=j+2;
			}
			else
			{
				
				arr3[j]=arr2[i];
				arr3[j+1]=arr1[i];
				j=j+2;
			}
		}
		
		for(int i=0;i<arr3.length;i++)
		{
		System.out.print(arr3[i]);	
		}
		
		
		
		
		
		
		
}}
