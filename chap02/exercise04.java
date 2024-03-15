package chap02;

import java.util.Scanner;

public class exercise04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		int sec = input.nextInt();
		
		int hours = 0;
		int minutes = 0;
		int second = 0;
		
		if (sec >= 3600) {
			hours = sec / 3600;
			int restSec = sec - (3600 * hours);
			minutes = restSec / 60;
			restSec = restSec - (minutes * 60);
			second = restSec;
		} 
		
		else if (3600 > sec && sec >= 60) {
			hours = 0;
			minutes = sec / 60;
			int restSec = sec - (60 * minutes);
			second = restSec;
		
		}
		
		else if (60 > sec && sec > 0) {
			hours = 0;
			minutes = 0;
			second = sec;
		}
		
		System.out.println(hours + "시간 " + minutes + "분 " + second + "초");
		
	}

}
