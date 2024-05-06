package chap06_programming04;

public class Child extends Parent {
	public String name = "사도세자";
	
	
	@Override
	public void print() {
		System.out.println("나는 " + name + "이다.");
	}
}
