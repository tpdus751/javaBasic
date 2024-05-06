package chap06_programming05;

public class Telephone extends Phone {
	private String when;
	
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	void autoAnswering() {
		System.out.println(owner + "가 없다." + getWhen() + " 전화 줄래.");
	}

	public String getWhen() {
		return when;
	}
}
