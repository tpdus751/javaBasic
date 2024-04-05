package classtest;

import java.util.Scanner;

public class CircleDemo01 {

	public static void main(String[] args) {
		System.out.print("원의 반지름 : ");
		Scanner in = new Scanner(System.in);
		
		Circle circle = new Circle(in.nextDouble());
		
		
		
		// 원의 반지름 출력
		System.out.println(circle.getRadius());
		circle.calArea();
		circle.show();
		
	}
	
	

}

