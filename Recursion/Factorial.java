class Factorial
{
  
	int fact(int n)
	{
		if(n>=1)
		{
			return n*(n-1);
		}
		else
		{
			return 1;
		}
	}
	public static void main(String...ru)
  {
  	Factorial F1=new Factorial();
  	F1.fact();
  }
}