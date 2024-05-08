package chap07_programming05;

public class Radio extends Controller {

	Radio(boolean power) {
		this.power = power;
	}
	
	@Override
	String getName() {
		return "라디오";
	}
	
	@Override
	void show() {
		if (this.power) {
			System.out.println(getName() + "가 켜졌습니다.");
		}
		else {
			System.out.println(getName() + "가 꺼졌습니다.");
		}
	}
}
