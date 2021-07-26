import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15649 {
	static int[] checklist;
	static int[] result;
	
	public static void main(String[] arg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		checklist = new int[n];
		result = new int[r];
		dfs(0, n, r);
		br.close();
	}
	static void dfs(int L, int n, int r) {
		if(L==r)
			print(result);
		else {
			for(int i = 0 ; i<n ;i++){
				if (checklist[i] == 0){
					checklist[i] = 1;
					result[L] = i+1;
					dfs(L+1, n ,r);
					checklist[i] = 0;
				}						
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
