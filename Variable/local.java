import java.util.*;
class Local
{
	int a=10; //Instance Variable
	static int b=10; // Static variable

	void sum()
	{
		int c; // Local variable;
		c=a+b;
		System.out.println("value of c = "+c);
	}

public static void main(String...ru)
{
	Local L1=new Local();
	L1.sum();
	
}}