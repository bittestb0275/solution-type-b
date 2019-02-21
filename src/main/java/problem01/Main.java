package problem01;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int[] result = new int[2];
		int mul = arr[0] * arr[1]; //초기값 고민
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				
				int tmp = arr[i] * arr[j];
				
				if(tmp > mul) {
					mul = tmp;
					result[0] = arr[i];
					result[1] = arr[j];
				}
			}
			
		}
		
		System.out.println(Arrays.toString(result));
		
	}
}
