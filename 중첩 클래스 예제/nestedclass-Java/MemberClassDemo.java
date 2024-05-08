package nestedclass;

public class MemberClassDemo {
	private String secret = "비공개";
	String s = "외부";

	class MemberClass {
		String s = "내부";

		public void showMemberClass() {
			System.out.println("내부 클래스");
			System.out.println(secret);

			System.out.println(s);

			System.out.println(MemberClassDemo.this.s);
		}

		// static String s3 = "w";
		// static void show2() {}
	}

	public static void main(String[] args) {
		MemberClassDemo mcd = new MemberClassDemo();
		MemberClassDemo.MemberClass memberClass = mcd.new MemberClass();

		System.out.println(mcd.s);
		System.out.println(memberClass.s);
		memberClass.showMemberClass();
	}
}