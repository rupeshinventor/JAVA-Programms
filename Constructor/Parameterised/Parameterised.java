class Constructor
{
	String Name;
	int Marks;
	Constructor(String N,int M)
	{
		this.Name=N;
		this.Marks=M;

	}
	public static void main(String...ru)
	{
		Constructor C1= new Constructor("Maths",50);
		Constructor C2=new Constructor("Programming",40);
		System.out.println("C1 = " + C1.Name+" "+C1.Marks);
		System.out.println("C2 = " + C2.Name+" "+C2.Marks);
	}
}