import java.util.Scanner;

public class No_2562 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[] array = new int[9];
		
		int max=0, index=0;
		
		for(int i=0; i<9; i++) {
			array[i] = scn.nextInt();
			if(max < array[i]) {
				max = array[i];
				index=i+1;
			}
		}
		
		System.out.println(max + "\n" + index);
	}
}