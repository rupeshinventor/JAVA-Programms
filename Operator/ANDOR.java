class AndOR
{
	public static void main(String...ru)
	{
		int age=20;
		int age1=18;
		if(age>=20 && age1>=18) //// AND operation both condn need to correct
		{
			System.out.println("You are allow to give vote your age is = "+age);
		}
		if(age>20 || age1>=18)  // OR operation one condn need to correct
		{
			System.out.println("You are allow to give vote your age is = "+age);
		}

		System.out.println(age%22);  // if divisor is greater than dividen
		                              // then reminder will dividend
		
	}
}