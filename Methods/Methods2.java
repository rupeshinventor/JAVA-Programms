class Methods2
{
	public static int calculate(int a,boolean b,int c,int d)
	{
		if(!b)
		{
			d=c+(a*d);
			System.out.println(d);
            return d;
		}
		
			return -1;   //Actually return comes here for else if will not take 
			            //then also no problem
		
	}
	public static void main(String...ru)
	{
    calculate(10,true,1000,17617);

	}
}