package chap02;

import java.util.Scanner;

public class exercise03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double pi = 3.14; 
		
		
		System.out.print("원기둥의 밑면 반지름은? ");
		int r = input.nextInt();
		System.out.print("원기둥의 높이는? ");
		int h = input.nextInt();
		System.out.println("원기둥의 부피는 " + ((pi * r * r) * h));
		

	}

}
