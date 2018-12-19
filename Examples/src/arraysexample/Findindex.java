package arraysexample;

import java.util.Arrays;

public class Findindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = {10,20,30,40,50};
		int result = 0;
		for(int i=0;i<n.length;i++)
		{
			result+=n[i];
		}
		float average = result/n.length;
		System.out.println(average);
		insert(n,3);
		int c[] = n;
		for(int i=0;i<c.length;i++)
		{
			c[i]=n[i];
		}
		System.out.println(Arrays.toString(c));
		
	}



public static void insert(int[] a,int i)
{
	for(int j=a.length-1;j>i;j--)
	{
		a[j]=a[j-1];
	}
	a[i] = 70;
	System.out.println(Arrays.toString(a));
	
}

}

