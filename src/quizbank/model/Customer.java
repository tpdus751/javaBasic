package quizbank.model;

public class Customer extends User {
	
	private int num;
	private String registeredTime;
	
	public Customer(int num, String name, String id, String password, String registeredTime) {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRegisteredTime() {
		return registeredTime;
	}

	public void setRegisteredTime(String registeredTime) {
		this.registeredTime = registeredTime;
	}
	
	
}
