package chap06_programming06;

public class Car extends Vehicle {
	int displacement;
	int gears;
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	
	void show() {
		super.show();
		System.out.print(", 배기량 : " + displacement + ", 기어단수 : " + gears);
	}
}
