//Program to find the Two duplicate elements in the array-Brute force approach.
import java.lang.*;
import java.util.*;
import java.io.*;

class finding{
	void getit(int a[], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
				if(a[i]==a[j])
					System.out.println("Two repeated numbers are" + a[i]);
		
		}
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,4,3,5,6,7,5};
		int n=a.length;
		finding obj = new finding();
		obj.getit(a,n);
	}
}