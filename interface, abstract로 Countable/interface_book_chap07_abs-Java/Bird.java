package interface_book_chap07_abs;

public class Bird extends Countable {
	Bird(String name, int num) {
		super(name, num);
	}
	
	void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다.");
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
		
	}
}
