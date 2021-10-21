package Problem_Solving_Java.level3;

import java.util.Scanner;

//시간 : 2021-10-21 19:48 ~ 19:53

/*
문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	   각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력 : 각 테스트 케이스마다 A+B를 출력한다.
*/

public class level_02_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T;
		T = sc.nextInt();
		
		int[] arr = new int[T];
		
		for (int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
