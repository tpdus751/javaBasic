package chap06_programming03;

public class MovablePoint extends Point {
	private int xSpeed, ySpeed;
	
	
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return super.toString() + " 속도 : [ " + xSpeed + ", " + ySpeed + "]";
	}
}
