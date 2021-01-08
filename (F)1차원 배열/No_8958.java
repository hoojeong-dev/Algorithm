import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8958 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		
		for(int i=0; i<n; i++) {
			str[i] = br.readLine();
			int score = 0, count = 0;
			
			for(int j=0; j<str[i].length(); j++) {
				
				if(str[i].charAt(j) == 'O') count++;
				else count = 0;
				
				score = score + count;
			}
			
			System.out.println(score);
		}
	}
}