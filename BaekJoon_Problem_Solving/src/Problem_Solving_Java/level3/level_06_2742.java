package Problem_Solving_Java.level3;

import java.util.Scanner;

//시간 : 2021-10-23 20:55 ~ 20:57

/*
문제 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

입력 : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

출력 : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
*/


public class level_06_2742 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		for (int i=N; i>=1; i--) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
