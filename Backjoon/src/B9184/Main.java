package B9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			if(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());

				if(a==-1 && b==-1 && c==-1)
					break;

				System.out.printf("w(%d,%d,%d) = %d\n", a,b,c,a);
			}
		}
	}
}
	
	

