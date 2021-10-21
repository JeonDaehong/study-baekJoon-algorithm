package Problem_Solving_Java.level3;

import java.util.Scanner;

//시간 : 2021-10-21 19:56 ~ 19:57

/*
문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력 : 1부터 n까지 합을 출력한다.
*/

public class level_03_8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int add = 0;
		
		int n;
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			add+=i;
		}
		
		System.out.println(add);

	}

}
