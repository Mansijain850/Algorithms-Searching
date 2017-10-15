//finding the element occuring maximum no of times -Brute Force approach by using 2 for loops.
import java.io.*;
import java.lang.*;
import java.util.*;

class doing{
	int check(int a[], int n)
	{
		int counter=0; 
		int max=0;
		int ind=0;
		for(int i=0;i<n;i++)
		{
			counter=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					counter++;

				}
				if(counter>max)
					max=counter;
					ind=i;

			}
			
		}
		return a[ind];
		
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,6};
		int n=a.length;
		doing obj = new doing();
		System.out.println("max el is " + obj.check(a,n));
		

	}
}