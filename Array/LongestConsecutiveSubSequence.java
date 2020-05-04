import java.util.*;
class LongestSubsequence
{
	public static void main(String...ru)
	{
		int Sequence_Length=0;
		HashSet <Integer> hs=new HashSet<>();
		int a[]={1,2,3,8,10,9,4};
		for (int i=0;i<a.length ;i++ ) {
			hs.add(a[i]);
		}
		for (int i=0;i<a.length;i++) {
			if (!hs.contains(a[i]-1)) {
				int no=a[i];
				while (hs.contains(no)) {
					no++;
					
				}
				if (Sequence_Length<no-a[i]) {

					Sequence_Length=no-a[i];
				}
				
			}
			
		}
		System.out.println(Sequence_Length);
	}
}