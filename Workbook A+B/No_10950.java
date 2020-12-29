import java.util.Scanner;

public class No_10950 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n, A, B;
		
		n = scn.nextInt();
		scn.nextLine();
		
		for(int i=0; i<n; i++) {
			A = scn.nextInt();
			B = scn.nextInt();
			System.out.println(A + B);
		}
	}
}