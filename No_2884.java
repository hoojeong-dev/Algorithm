import java.util.Scanner;

public class No_2884 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int H = scn.nextInt();
		int M = scn.nextInt();
		
		int m_alarm = M - 45;
		int h_alarm = H;
		
		if(m_alarm < 0) {
			h_alarm = h_alarm - 1;
			m_alarm = 60 + m_alarm;
			
			if(h_alarm < 0)
				h_alarm = 24 + h_alarm;
		}
		System.out.println(h_alarm + " " + m_alarm);
		
	}
}