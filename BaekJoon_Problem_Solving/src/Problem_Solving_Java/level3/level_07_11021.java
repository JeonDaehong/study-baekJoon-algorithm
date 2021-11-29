package Problem_Solving_Java.level3;

import java.util.Scanner;

//시간 : 2021-11-29 12:08 ~ 12:13

/*
문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
	   각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.


풀이 후 느낀점 : 백준은 프로그래머스보다 빡빡하다.. T값이 임의로 주어지는줄 알았는데, 아니었음. 이거 찾느냐 시간 버림.

*/

public class level_07_11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int i=1; i<=T; i++) {
		
			int A = sc.nextInt();
			int B = sc.nextInt();
					
			System.out.println("Case #" + i + ": " + (A+B));
		}	
	}
}
