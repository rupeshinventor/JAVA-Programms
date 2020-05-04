class SelectionSort
{
	public static void main(String...ru)
	{
		int arr[]={10,2,5,98,30};
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
				}
				
			}
			
			
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i] +" ");
			
		}
	}
}