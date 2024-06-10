package quizbank.model;

public class Customer extends User {
	
	private int num;
	
	public Customer(int num, String name, String id, String password) {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
}
