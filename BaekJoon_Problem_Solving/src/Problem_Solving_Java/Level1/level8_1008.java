package Problem_Solving_Java.Level1;

import java.util.Scanner;

//시간 : 2021-10-21 09:46 ~ 09:47

//문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력 : 첫째 줄에 AB를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

public class level8_1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b;		// 소수점이 나와야하기에, int가 아닌 double을 사용한다.
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(a/b);
		
		sc.close();

	}

}
