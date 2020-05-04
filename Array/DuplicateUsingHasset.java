import java.util.*;
class DuplicateUsingHasset
{
	public static void main(String...ru)
	{
		int [] a={1,2,2,3,4,5};
		HashSet <Integer> hs=new HashSet<>();
		for (int i=0;i<a.length-1 ;i++) {
			hs.add(a[i]);
			
		}
		for (int no:hs ) {
			System.out.println(no);
			
		}
	}
}