package chap09;

public class Example03 {

	public static void main(String[] args) {
		String s1 = " Java";
		String s2 = " Programming\n";
		
		String s = s1.concat(s2);
		System.out.println("s.length()" + s.length() + "(" + s + ")");
		s = s.trim();
		System.out.println("s.length()" + s.length() + "(" + s + ")");
		
		System.out.println("s.charAt(1) : " + s.charAt(1));
		System.out.println("s.substring(6) : " + s.substring(6));
		System.out.println("s.substring(5, 13) : " + s.substring(5, 13));
		System.out.println("s.indexOf('P') : " + s.indexOf('P'));
		System.out.println("s.toLowerCase() : " + s.toLowerCase());
		System.out.println("s.toUpperCase() : " + s.toUpperCase());
	}

}
