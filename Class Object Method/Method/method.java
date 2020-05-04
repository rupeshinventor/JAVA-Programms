import java.util.*;
class Method
{
	String color;
	int age;
	void get(String c,int a)
	{
		color=c;
		age=a;
	}
	void dis()
	{
		System.out.println(color+" "+age);
	}
	public static void main(String...ru)
	{
		Method M1=new Method();
		M1.get("Black",10);
		M1.dis();
	}
}