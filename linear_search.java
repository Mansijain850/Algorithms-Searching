import java.lang.*;
import java.io.*;
import java.util.*;

class searchL
{
	
	int search(int a[], int n, int x)
	{
			for(int i=0;i<n;i++)
			{
				if(a[i]==x)
					return 1;
			}
			return -1;

	}
	
	public static void main(String[] args){
		int a[] ={1, 2, 3, 4, 5, 6, 7};
		
		searchL obj = new searchL();
		int x=67;
		int n=a.length;
		int result = obj.search(a,n,x);
		
		
		if(result==1)
			System.out.println("found yay");
		else 
			System.out.println("Nope nah! In next life maybe");

	}

}  