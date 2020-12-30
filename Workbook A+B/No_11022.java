import java.util.Scanner;

public class No_11022 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		scn.nextLine();
		
		for(int i=1; i<=n; i++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
	}
}