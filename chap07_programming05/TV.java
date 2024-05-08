package chap07_programming05;

public class TV extends Controller {

	TV(boolean power) {
		this.power = power;
	}
	
	@Override
	String getName() {
		return "TV";
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
