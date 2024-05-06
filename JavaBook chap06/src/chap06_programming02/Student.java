package chap06_programming02;

public class Student extends Person {
	public int number;
	
	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}
	
	public void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + ", 학번 : " + number + "]");
	}
}
