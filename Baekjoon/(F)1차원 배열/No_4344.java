import java.util.Scanner;

public class No_4344 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int n = Integer.parseInt(scn.nextLine());
		
		for(int i=0; i<n; i++) {
			int tcase = scn.nextInt();
			int[] score = new int[tcase];
			int sum = 0, count = 0;
			double avg = 0;
			
			for(int j=0; j<tcase; j++) {
				score[j] = scn.nextInt();
				sum = sum + score[j];
			}
			avg = sum/tcase;
			
			for(int j=0; j<tcase; j++) {
				if(score[j] > avg)
					count++;
			}
			
			double value = 100.0*count/tcase;
			System.out.println(String.format("%.3f", value) + "%");
		}
	}
}