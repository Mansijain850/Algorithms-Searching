//get the sum of numbers = n*(n-1)/2
//subtract all the numbers from the sum and ans will be missinfg number
import java.io.*;
import java.lang.*;
import java.util.*;

class findit{
	int getnumber(int a[], int n)
	{
		int sum = (n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		{
			sum -= a[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		int a[] = {1,3,4,2,6,7};
		int n=a.length;
		findit obj = new findit();

		int result = obj.getnumber(a,n);
		System.out.println("Number is: " + result);
	}
}