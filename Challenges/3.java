class ChllengeOperator
{
	public static void main(String...ru)
	{
		double d=20.00;
		double d1=80.00;
		double result = (d+d1)*100;
		result = result%40.00;
		System.out.println(result);
		boolean b=(result==0) ? true : false;
		System.out.println(b);
		if(!b)
		{
			System.out.println("Goto Remider");
		}

	}
}