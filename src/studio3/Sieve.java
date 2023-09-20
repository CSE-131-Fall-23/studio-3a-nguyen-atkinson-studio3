package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		n= in.nextInt();
		boolean [] allnumbers = new boolean[n];
		//System.out.print(allnumbers[n-1]);
		for(int i =2; i< allnumbers.length; i++)
		{
			allnumbers[i] = true;
		}
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if (allnumbers[i]) //if allnumbers(i) is true
				{
				for (int j = (int) Math.pow(i,2); j<n; j=j+i)
				{
					allnumbers[j] = false;
				}
					}
		}
		for(int value = 2; value<n; value++)
		{
			if (allnumbers[value]) //if allnumbers is true
			{
				System.out.println(value);
			}
		}
	}
}
			
		


