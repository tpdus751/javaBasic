package chap03;

public class num_5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20 - i; j++) {
				for (int k = 1; k <= 20 - i - k; k++) {
					if (i + j + k <= 20) {
						if ((i * i) + (j * j) == (k * k)) {
							System.out.println(i + " " + j + " " + k);
						}
					}
				}
			}
		}

	}

}
