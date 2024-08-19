import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // 별찍기 출력
		// 5입력시 아래와 같이 * 찍
		//     *
		//    **
		//   ***
		//  ****
		// *****
		int num = input.nextInt();
		for(int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
            }
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
            }
			System.out.println();
    }
}