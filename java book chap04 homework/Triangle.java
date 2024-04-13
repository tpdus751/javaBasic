package chap04;



public class Triangle {
	
	private double bottom_bean;
	private double height;
	
	
	public Triangle(double bottom_bean, double height) {
		this.bottom_bean = bottom_bean;
		this.height = height;
		
	}
	
	public double findArea() {
		double N = (bottom_bean * height) / 2;
		return N;
	}
	
	public boolean isSameArea(Triangle t) {
		double area = findArea();
		double area1 = t.findArea();
		if (area == area1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}

