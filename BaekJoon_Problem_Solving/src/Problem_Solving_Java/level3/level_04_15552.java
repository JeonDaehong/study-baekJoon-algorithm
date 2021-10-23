package Problem_Solving_Java.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//시간 : 2021-10-23 20:35 ~ 20:39

/*
문제 : 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
	   입출력 방식이 느리면 여러 줄을 입력받거나
	   출력할 때 시간초과가 날 수 있다는 점이다.
	   Java를 사용하고 있다면, Scanner와 System.out.println 대신
	   BufferedReader와 BufferedWriter를 사용할 수 있다.
	   BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
	   

입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
	   다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

출력 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다..
*/

public class level_04_15552 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
		
			int T = Integer.parseInt(br.readLine());
			
			StringTokenizer st;
			
			for (int i=0; i<T; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
			}
			
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {br.close();} catch (IOException e) {e.printStackTrace();}
			try {bw.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
}
