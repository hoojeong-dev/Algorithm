import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1003 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(fibonacci(n) + " " + fibonacci(n+1));
		}
		
	}
	
	static int fibonacci(int n) {
		
		int a=1, b=0, c=1;
		
		if(n==0) return 1;
		else if(n==1) return 0;
		
		else {
			for(int i=1; i<=n; i++) {
				a=b;
				b=c;
				c=a+b;
			}
			return a;
		}
	}
}