package print;

public class print01 {

	public static void main(String[] args) {
		String myName = "박세연";
		int myAge = 26;
		
		System.out.println("* 이름 : " + myName);
		System.out.println("* 나이 : " + myAge);
		System.out.println();
		
		System.out.print("* 이름 : " + myName);
		System.out.println("    * 나이 : " + myAge);

	}

}
