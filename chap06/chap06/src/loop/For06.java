package loop;



public class For06 {

	public static void main(String[] args) {
		
		
		for (int i = 2; i <= 9; i++) {
			System.out.println("[ 구구단 " + i +"단 ]");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
			

	}

}
