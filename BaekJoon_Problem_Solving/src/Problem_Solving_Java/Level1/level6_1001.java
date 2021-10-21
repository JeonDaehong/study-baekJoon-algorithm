package Problem_Solving_Java.Level1;

import java.util.Scanner;

//시간 : 2021-10-21 09:43 ~ 09:44

//문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력 : 첫째 줄에 A-B를 출력한다.

public class level6_1001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(a-b);
		
		sc.close();
		
	}

}
