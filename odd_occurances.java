import java.io.*;
import java.lang.*;
import java.util.*;

class oddoccur
{
	int getit(int a[], int n)
	{
		int result=0;
		for(int i=0;i<n;i++)
			result=result^a[i];
		return result;
	}
	public static void main(String[] args) {
		int a[] ={1,1,2,3,2,5,5};
		int n=a.length;
		oddoccur obj = new oddoccur();
		int display= obj.getit(a,n);
		System.out.println(display);
	}
}