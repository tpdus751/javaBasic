package interface_book_chap07_abs;

public class Tree extends Countable {
	
	Tree(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
		
	}
	
	void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
	
	
}
