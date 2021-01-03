import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 배열을 이용한 방법

public class No_3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[42];
		int count = 0;

		for (int i = 0; i < array.length; i++)
			array[i] = -1;

		for (int i = 0; i < 10; i++)
			array[Integer.parseInt(br.readLine()) % 42] = 1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != -1)
				count++;
		}

		System.out.println(count);
	
	}
}


/* HashSet을 이용한 방법
 *  HashSet은 자바 Collection 중 Set의 파생 클래스.
 *  다시 말해, Set을 집합이라고 생각하면 됨.
 */
/* HashSet의 특징
 *  1. 중복되는 원소를 넣을 경우, 하나의 원소만을 저장한다. (중복을 허용하지 않음)
 *  2. 순서 개념이 없기 때문에, 정렬을 원할 경우 리스트로 변환해야 한다.
 *  3. HashSet<객체 타입>
 */

public class No_3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			hash.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(hash.size());
	
	}
}