import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 문제 1
        //    472 -- (1)
        // x  385 -- (2)
        // ------
        //   2365 -- (3)
        //  3776  -- (4)
        // 1416   -- (5)
        // ------
        // 181720 -- (6)
        
        // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
        
        int a1 = input.nextInt();;
        int b1 = input.nextInt();;
        
        int c3 = b1 % 10;
        int c2 = (b1 / 10) % 10;
        int c1 = (b1 / 10) / 10;
        
        int d1 = a1 * c3;
        int e1 = a1 * c2;
        int f1 = a1 * c1;
        int g1 = d1 + (e1 * 10) + (f1 * 100);
        
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
    }
}