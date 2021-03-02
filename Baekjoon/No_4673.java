import java.util.Scanner;

public class No_4973 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] array = new int[10001];
		
		for(int i=1; i<100001; i++) {
			int n = d(i);		// n에는 생성자가 있는 수가 저장되어 있음
			
			if(n<10001)
				array[n] = 1;			// 생성자를 인덱스로 하는 배열에 1저장
		}
		
		for(int i=1; i<10001; i++) {
			if(array[i] ==0)		// 0이 저장되어 있는 인덱스(셀프 넘버)를 출력
				System.out.println(i);
		}
	}

	static int d(int n) {
		
		int sum = n;
		
		while(n != 0) {		// n의 한 자리씩 분리해서 sum에 더함
			sum = sum + (n % 10);
			n = n/10;
		}
		
		return sum;		// 반환한 sum 값은 셀프 넘버가 아님
	}
}