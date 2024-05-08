package chap07_programming04;

public class TalkableTest {
	
	static void speak(Talkable t) {
		t.talk();
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}

}
