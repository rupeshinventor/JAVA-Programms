class RotationArray
{
	void leftRotate(int a[],int d,int n)
	{
		for (int i=0;i<d;i++ ) 
		 leftRotate(a,n);
	}
	void leftRotate(int a[],int n)
	{
		int i,temp;
		temp=a[0];
		for (i=0;i<n-1;i++ ) 
			a[i]=a[i+1];
		a[i]=temp;
	}
	void printArray(int a[],int n)
	{
		for (int i=0;i<n;i++ )
			System.out.println(a[i]);
	}
	public static void main(String...ru)
	{
     int a[]={1,2,3,4,5,6,7};
     RotationArray rotate = new RotationArray();
     rotate.leftRotate(a,2,7);
     rotate.printArray(a,7);

	}
}