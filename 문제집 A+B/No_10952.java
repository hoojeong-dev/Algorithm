import java.util.Scanner;

public class No_10952 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int A, B;
		
		while(scn.hasNext()) {
			A = scn.nextInt();
			B = scn.nextInt();
			
			if(A==0 && B==0)
				break;
			
			System.out.println(A + B);
		}
	}
}