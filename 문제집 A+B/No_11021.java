import java.util.Scanner;

public class No_11021 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		scn.nextLine();
		
		for(int i=0; i<n; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			
			System.out.println("Case #" + (i+1) + ": " + (A+B));
		}
	}
}