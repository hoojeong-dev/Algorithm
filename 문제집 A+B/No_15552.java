import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Scanner;

public class No_15552 {

	public static void main(String[] args) {

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(read.readLine());
			
			for(int i=0; i<n; i++) {
				String str = read.readLine();
				String[] tokens =  str.split(" ");
				
				write.write((Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1])) + "\n");
			}
			
			write.flush();
			write.close();
			read.close();
		} catch (IOException e) { }
	}
}