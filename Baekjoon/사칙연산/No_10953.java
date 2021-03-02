import java.util.Scanner;
import java.util.StringTokenizer;

public class No_10953 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		scn.nextLine();
		
		for(int i=0; i<n; i++) {
			String str = scn.nextLine();
			String[] tokens = str.split(",");
			System.out.println(Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]));
		}
	}
}