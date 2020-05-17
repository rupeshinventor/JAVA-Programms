import java.util.*;
class SumOfAllEvenAndOddInArray
{
	public static void main(String...ru)
	{
		int arr[]={4,7,9,5,8,6};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
			{
				al1.add(arr[i]);

			}
			else 
			{
				al2.add(arr[i]);
			}
			
		}
		int total=0;
		for(int no:al1)
		{
			
			total=total+no;
			
		}
		System.out.println("Sum Of All even No is : = " +" " +total);
		int total1=0;
		for(int no:al2)
		{
			
			total1=total1+no;
			
		}
     System.out.println(" Sum All odd No is : = "+" " +total1);
}
}