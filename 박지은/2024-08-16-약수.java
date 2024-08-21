import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int[] arr = new int[count];

		for(int i = 0; i < count; i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		int num1 = arr[0];
		int num2 = arr[arr.length - 1];
	
		int result = num1 * num2;
		
		System.out.println(result);

		input.close();
	}

}
