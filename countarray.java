//Finding two duplicate elements in an array - Using count array approach. 
import java.lang.*;
import java.util.*;
import java.io.*;

class finddup
{
	void printdup(int a[], int n)
	{
		int count[] = new int[n];
		for(int i=0;i<n;i++)
			if(count[a[i]]==1)
				System.out.println(a[i]);
			else 
				count[a[i]]++;
	}
	public static void main(String[] args) {
		int a[]={1,2,3,1,4,5,4};
		int n=a.length;
		finddup obj = new finddup();
		obj.printdup(a,n);

	}
}