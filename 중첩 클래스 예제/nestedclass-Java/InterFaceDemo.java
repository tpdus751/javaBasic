package nestedclass;

public class InterFaceDemo {
	class Icon {
		interface Touchable {
			void touch();
		}
	}

	public class InnerInterfaceDemo implements Icon.Touchable {
		public void touch() {
			System.out.println("아이콘을 터치한다.");
		}
	}

		public static void main(String[] args) {	
			InterFaceDemo demo = new InterFaceDemo();
			Icon.Touchable btn = demo.new InnerInterfaceDemo();
			btn.touch();
		}
	
}

	