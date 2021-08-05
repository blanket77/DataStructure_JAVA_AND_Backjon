package Pibo;

import java.util.Scanner;

public class Main {
	static long[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=1;
		while(a != 0)
		{
			a = Integer.parseInt(sc.nextLine());
			arr = new long[a+1];
			long result = pibo(a);
			System.out.println(result);
		}
		
	}

	static long pibo(int n)
	{
		if (n==1 || n==2)
			return 1;
		
		else if (arr[n] != 0 )
			return arr[n];
		
		else
			return pibo(n-1) + pibo(n-2);
	}
}
