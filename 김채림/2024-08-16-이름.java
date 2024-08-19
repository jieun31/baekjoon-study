package Main;

import java.util.Scanner;

public class _2480 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		
		if( n1 == n2 && n1 == n3 && n2 == n3 ) {
			System.out.println( 10000 + n1*1000);
		} else if( n1 == n2 || n1 == n3 || n2 == n3) {
			if( n1 == n2 ) {
				System.out.println( 1000 + n2*100);
			}else if( n1 == n3) {
				System.out.println( 1000 + n3*100);
			}else if( n2 == n3 ) {
				System.out.println( 1000 + n3*100);
			}
		}
		if( n1 != n2 && n1 != n3 && n2 != n3 ) {
			if( n1 > n2 && n1 > n3 ) {
				System.out.println( n1 * 100 );
			}else if( n2 > n1 && n2 > n3 ) {
				System.out.println( n2 * 100 );
			}else if( n3 > n1 && n3 > n2 ) {
				System.out.println( n3 * 100 );
			}
		}
	}
}
