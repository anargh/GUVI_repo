/*
Given 2 arrays of integers a1,a2 check if a1 is a subset of a2
*/
import java.util.Scanner;
class evaluateSubset
{
	int a[],b[];
	void compareSet(int x1[],int x2[])
	{
		a=x1;b=x2;
		int a_count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					++a_count;
			}
		}
		if(a_count==a.length)
			System.out.println("A1 is subset of A2.");

		else
			System.out.println("A1 is not subset of A2.");
	}
}
public class findSubset
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		evaluateSubset es=new evaluateSubset();
		int[] ar1,ar2;
		int ar1_length=input.nextInt();  // Get size of first subset
		int ar2_length=input.nextInt(); // Get size of second subset
		ar1=new int[ar1_length];
		ar2=new int[ar2_length];
		for(int i=0;i<ar1_length;i++)
			ar1[i]=input.nextInt();
		for(int i=0;i<ar2_length;i++)
			ar2[i]=input.nextInt();
		es.compareSet(ar1,ar2);
	}
}
