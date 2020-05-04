class BubbleSort
{
	public static void main(String...ru)
	{
		int arr[]={12,4,5,68,90};
		for (int i=0;i<arr.length;i++ ) {
			for (int j=0;j<arr.length-1 ;j++ ) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}

			
		}
		for (int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]+" ");
			
		}
	}
}