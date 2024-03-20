package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max01 {
	
	public static int getMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		
		System.out.print("세 개의 숫자를 입력하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력
		String inStr = br.readLine();
		
		// 토큰화
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int max = getMax(a, b, c);
		System.out.println("최대값은 " + max + "입니다.");

	}

}
