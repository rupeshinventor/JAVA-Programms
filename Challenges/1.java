class Challenge1
{
	public static void main(String...ru)
	{
		byte b=10;
		short s=20;
		int i = 50;
		long l=50000L+((b+s+i)*10L);
		short total=(short) (1000+((b+s+i)*10L)); //Typecasting.
		System.out.println(l);
		System.out.println(total);
	}
}