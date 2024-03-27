package chap03;

import java.util.Scanner;

public class num_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("철수 : ");
		
		char chulSu = input.next().charAt(0);
		
		System.out.println();
		
		System.out.print("영희 : ");
		
		char yeongHeu = input.next().charAt(0);
		
		System.out.println();
		
		int point = 1;
		
		while (point == 1) {
			// 영희가 s일때
			if (chulSu == 'r' && yeongHeu == 's') {
				System.out.println("철수, 승!");
				point = 0;
			}
			else if (chulSu == 's' && yeongHeu == 's') {
				System.out.println("무승부!");
				break;
			}
			else if (chulSu == 'p' && yeongHeu == 's') {
				System.out.println("영희, 승!");
				point = 0;
			}
			// 영희가 r일때
			else if (chulSu == 'r' && yeongHeu == 'r') {
				System.out.println("무승부!");
				break;
			}
			else if (chulSu == 's' && yeongHeu == 'r') {
				System.out.println("영희, 승!");
				point = 0;
			}
			else if (chulSu == 'p' && yeongHeu == 'r') {
				System.out.println("철수, 승!");
				point = 0;
			}
			// 영희가 p일때
			else if (chulSu == 'r' && yeongHeu == 'p') {
				System.out.println("영희, 승!");
				point = 0;
			}
			else if (chulSu == 's' && yeongHeu == 'p') {
				System.out.println("철수, 승!");
				point = 0;
			}
			else if (chulSu == 'p' && yeongHeu == 'p') {
				System.out.println("무승부!");
				break;
			}
		}
		
		
	}

}
