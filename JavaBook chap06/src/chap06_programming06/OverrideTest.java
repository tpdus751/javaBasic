package chap06_programming06;

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		
		System.out.println();
		Vehicle v = c;
		v.show();

	}

}
