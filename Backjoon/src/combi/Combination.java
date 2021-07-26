package combi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination {
	static int[] result;
	
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		result = new int[r];
		dfs(0, 0 , n, r); // Level 0, start 0
		br.close();
	}
	static void dfs(int L, int start, int n, int r) {
		if(L==r)
			print(result);
		else {
			for(int i = start ; i<n ;i++){
				result[L] = i+1;
				dfs(L+1, i+1,n ,r);
			}						
		}
	}
		

	
	static void print(int[] A) {
		for(int i = 0 ; i<A.length ; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}	
}

