//Program to find the 1st duplicate element in the array
import java.lang.*;
import java.io.*;
import java.util.*;

class duplicate{
	int check(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
					System.out.println("first duplicate element is : " + a[i]);
					return 0;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int a[] ={1,3,3,3,1,6};
		int n = a.length;
		duplicate obj = new duplicate();
		obj.check(a,n);

	}
}