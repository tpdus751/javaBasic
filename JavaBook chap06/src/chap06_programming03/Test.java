package chap06_programming03;

public class Test {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 20);
		Point p2 = new MovablePoint(10, 20, 100, 200);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
