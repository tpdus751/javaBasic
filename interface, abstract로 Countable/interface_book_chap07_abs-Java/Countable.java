package interface_book_chap07_abs;

public abstract class Countable {
	protected String name;
	protected int num;
	
	Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	abstract void count();
}
