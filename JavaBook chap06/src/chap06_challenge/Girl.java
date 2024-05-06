package chap06_challenge;

public class Girl {
	protected String name;
	
//	public Girl() {
//        this.name = "Unknown"; // 기본 이름 설정
//    }
	
	public Girl(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(name + "는 자바 초보자이다.");
	}
}
