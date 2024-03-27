package chap03;

import java.util.Scanner;

public class num_7 {

	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);
	}


	private static String input(String message) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(message + " : ");
		
		char who = input.next().charAt(0);
		
		String rsp = "what";
		
		if (who == 'r') {
			rsp = "rock";
		}
		else if (who == 's') {
			rsp = "scissors";
		} 
		else if (who == 'p') {
			rsp = "paper";
		}
		
		System.out.println();
		
		return rsp;
		
	}
	
	private static void whosWin(String c, String y) {
		int point = 1;
		
		while (point == 1) {
			// 영희가 s일때
			if (c == "rock" && y == "scissors") {
				System.out.println("철수, 승!");
				point = 0;
			}
			else if (c == "scissors" && y == "scissors") {
				System.out.println("무승부!");
				break;
			}
			else if (c == "paper" && y == "scissors") {
				System.out.println("영희, 승!");
				point = 0;
			}
			// 영희가 r일때
			else if (c == "rock" && y == "rock") {
				System.out.println("무승부!");
				break;
			}
			else if (c == "scissors" && y == "rock") {
				System.out.println("영희, 승!");
				point = 0;
			}
			else if (c == "paper" && y == "rock") {
				System.out.println("철수, 승!");
				point = 0;
			}
			// 영희가 p일때
			else if (c == "rock" && y == "paper") {
				System.out.println("영희, 승!");
				point = 0;
			}
			else if (c == "scissors" && y == "paper") {
				System.out.println("철수, 승!");
				point = 0;
			}
			else if (c == "paper" && y == "paper") {
				System.out.println("무승부!");
				break;
			}
		}
	}
}

	

