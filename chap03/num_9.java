package chap03;

public class num_9 {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘있어");

	}
	
	static void foo(String message, int num) {
		System.out.println(message + " " + num);
	}
	
	static void foo(String message, int num, int num_2) {
		System.out.println(message + " " + num + " " + num_2);
	}
	
	static void foo(String message) {
		System.out.println(message);
	}
}
