package chap03;

public class num_8 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	static int factorial(int n) {
			int fac = 1;
		
			switch (n) {
			case 5 : 
				fac *= 5;
				
			case 4 :
				fac *= 4;
				
			case 3 :
				fac *= 3;
				
			case 2 :
				fac *= 2;
				
				
			case 1 :
				break;
			}
			
			return fac;
		
	}

}
