import java.util.Scanner;

public class No_10818 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = Integer.parseInt(scn.nextLine());
		int[] array = new int[n];
		
		array[0] = scn.nextInt();
		
		int min=array[0], max=array[0];
		
		for(int i=1; i<n; i++) {
			array[i] = scn.nextInt();
			if(min > array[i]) min = array[i];
			if(max < array[i]) max = array[i];
		}
		
		System.out.println(min + " " + max);
	}
}