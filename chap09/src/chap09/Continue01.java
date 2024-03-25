package chap09;

public class Continue01 {

	public static void main(String[] args) {
		for (int i = 2; i < 9 + 1; i++) {
			if (i == 4 || i == 7) {
				continue;
			}
			System.out.println("<구구단 " + i + "단>");
			for (int j = 1; j < 9 + 1; j++) {
				System.out.println(i + "x" + j + " = " + (i * j));
			}
			System.out.println();
		}

	}

}
