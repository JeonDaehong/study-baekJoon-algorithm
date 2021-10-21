package Problem_Solving_Java.Level1;

import java.util.Scanner;

// 시간 : 2021-10-21 09:34 ~ 09:35

// 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출력 : 첫째 줄에 A+B를 출력한다.

public class level5_1000 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("A : ");
		a = scan.nextInt();
		System.out.print("B : ");
		b = scan.nextInt();
		
		
		System.out.println(a+b);
		
		scan.close();

	}

}
