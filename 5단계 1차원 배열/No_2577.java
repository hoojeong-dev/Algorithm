import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt(), b = scn.nextInt(), c = scn.nextInt();
		
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i=0; i<array.length; i++) {
			int count=0;
			int temp = a*b*c;
			
			while(temp != 0) {
				if(temp%10 == array[i])
					count++;
				temp /=10;
			}
			
			System.out.println(count);
		}
		
	}
}