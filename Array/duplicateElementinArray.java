class DuplicateElement
{
	public static void main(String...ru)
	{
		int [] a={1,2,2,3,4,4};
		int j=0;
		for (int i=0;i<a.length-1 ;i++ ) {
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[a.length-1];
		for (int i=0;i<j+1;i++ ) {
			System.out.println(a[i]);
			
		}
	}
}