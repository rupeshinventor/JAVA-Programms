class MinMax
{
	public static void main(String...ru)
	{
		int [] a={3,4,5,8,9,2};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else if (min>a[i]) {
				min=a[i];
				
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
}