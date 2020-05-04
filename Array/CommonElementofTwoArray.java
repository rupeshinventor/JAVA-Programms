import java.util.*;
class CommomElementOfTwoArray
{
	public static void main(String...ru)
	{
		HashSet <Integer> hs=new HashSet<>();
		int a[]={1,2,3,4};
		int b[]={1,2};
		for (int i=0;i<a.length ;i++ ) {
			for (int j=0;j<b.length ;j++ ) {
				if(a[i]==a[j])
				{
					hs.add(a[i]);
				}

			}
			
		}
		for (int no:hs) {
			System.out.println(no);
			
		}
	}
}