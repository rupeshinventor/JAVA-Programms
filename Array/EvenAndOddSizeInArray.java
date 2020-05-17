import java.util.*;
class EvenAndOddSizeInArray
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
		
		System.out.println("Size even No is : = " +" " +al1.size());
		
		
		

			
			 System.out.println("Size of odd No is : = "+" " +al2.size());
			
		
     
}
}