class SecondLargestAndSmallest
{
	public static void main(String...ru)
	{
		int a[]={1,2,4,6,8};
		int temp;
		for (int i=0;i<a.length ;i++ ) {
			for (int j=i+1;j<a.length ;j++ ) {
				
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

				
			}
			if(i==1)
		{
			break;
		}
		}

		/*for (int i=0;i<a.length; i++ ) {   //Sorting logic

			System.out.println("Sorting in desding order"+a[i]);
		}*/
		//System.out.println("Second Largest Element is "+a[1]);
		System.out.println("Second smallest Element is "+a[1]);
	}
}