package B15651;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] result;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		result = new int[r];
		dfs(0,n, r); // Level 0
		br.close();
		bw.flush();
		bw.close();
	}
	static void dfs(int L, int n, int r) throws IOException {
		if(L==r)
			print(result);
		else {
			for(int i = 0 ; i<n ;i++){
				result[L] = i+1;
				dfs(L+1, n ,r);
			}						
		}
	}
		

	
	static void print(int[] A) throws IOException {
		for(int i = 0 ; i<A.length ; i++) {
			bw.write(A[i] + " ");
		}
		bw.write("\n");
	}	
}

