package chap06_programming02;

public class ForeignStudent extends Student {
	public String nation;
	
	public ForeignStudent(String name, int age, int number, String nation) {
		super(name, age, number);
		this.nation = nation;
	}
	
	public void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + number + ", 국적 : " + nation + "]");
	}
}
