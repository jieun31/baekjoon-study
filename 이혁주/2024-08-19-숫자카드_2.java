/**
 
문제
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.

예제 입력 1 
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
예제 출력 1 
3 0 0 1 2 0 0 2
*/

// 접근 1: array 사용

// 코드 : 시간초과 (중첩루프)
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int count = 0;
		int N = input.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			number = input.nextInt();
			arr[i] = number;
		}

		int M = input.nextInt();
		for (int j = 0; j < M; j++) {
			count = 0;
			number = input.nextInt();
			for (int z = 0; z < N; z++) {
				if (number == arr[z]) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}

}


// 접근 2: HashMap 사용 
// 코드 : 시간초과 (containsKey 로 map을 한번 더 돌기 때문에)

import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int number;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		// [6:1] [3:2] [2:1] [10:3] [-10:2] [7:1]
		
		for (int i = 0; i < N; i++) {
			number = input.nextInt();
			map.put(number, map.getOrDefault(number, 0) + 1);
		}
		
		int M = input.nextInt();
		for (int j = 0; j < M; j++) {
			number = input.nextInt();
			
			if(map.containsKey(number)) {
				System.out.print(map.get(number) + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}

}

// 접근 3: HashMap 사용 + StringBuilder 
// map에 키가 존재하는지 체크하지 않고 바로 StringBuilder로 추가
// I/O 작업을 최소화
// 코드

import java.util.Scanner;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			int number = input.nextInt();
			map.put(number, map.getOrDefault(number, 0) + 1);
		}
		
        int M = input.nextInt();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int num = input.nextInt();
            result.append(map.getOrDefault(num, 0)).append(" ");
        }
        
        System.out.println(result.toString());
	}

}



/**

시간/공간복잡도

시간복잡도:
방법 1: 
시간복잡도: O(N^2) - 중첩

방법 2: 
시간복잡도: O(N+M) - containsKey 는 O(1)

방법 3: 
시간복잡도: O(N+M)

*/