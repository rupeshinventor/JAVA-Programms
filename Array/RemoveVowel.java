import java.util.*;
class RemoveVowel
{
	public static void main(String...ru)
	{
		String c="aeiouppl";
	    char result;
	    char NoVowel;
		char []a=c.toCharArray();
		for (int i=0;i<a.length; i++) {
			if ((a[i]=='a') || (a[i]=='e') || (a[i]='i') || (a[i]=='o') || (a[i]=='u')) {

				result=a[i];
			}
			else
			{
             NoVowel=a[i];
             System.out.println(NoVowel);
			}

			
		}
	}
}