import java.util.Scanner;
import java.io.IOException;


public class No_1546 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		double[] array = new double[n];
		double max = 0, total = 0;
		
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();

			if(array[i] > max)
				max = array[i];
		}
		
		for(int i=0; i<n; i++) {
			array[i] = array[i]/max*100;
			total = total + array[i];
		}

		System.out.println(total/n);
		
	}
}