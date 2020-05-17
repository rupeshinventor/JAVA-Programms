import java.util.*;
class SumOfAllEvenAndOddNo
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
		for(int no:al1)
		{
			System.out.println("All even No is : = " +" " +no);
		}
		for(int no:al2)
		{
			System.out.println("All odd No is : = "+" " +no);
		}

}
}