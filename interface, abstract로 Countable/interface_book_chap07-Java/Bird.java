package interface_book_chap07;

public class Bird implements Countable {
	
	String name;
	
	Bird(String name) {
		this.name = name;
	}
	
	void fly() {
		System.out.println("2마리 " + name + "가 날아간다.");
	}

	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
		
	}
}
