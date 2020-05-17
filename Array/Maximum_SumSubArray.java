class MaximumSumSubarray
{
	public static void main(String...ru)
	{
		int a[]={-2,-1,-3,4,-1,2,1,-5,4};
		int max_so_far = Integer.MIN_VALUE;
		int max_so_end =0;
		for (int i=0;i<a.length;i++) {
			max_so_end=max_so_end+a[i];
			if(max_so_far<max_so_end)
			{
				max_so_far=max_so_end;
			}
			if (max_so_end<0) {
				max_so_end=0;
				
			}
			
		}
		System.out.println(max_so_far);
	}
}