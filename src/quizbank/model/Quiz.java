package quizbank.model;

public class Quiz {
	
	private int num;
	private String quizName;
	private String answer;
	private String comment;

	public Quiz(int num, String quizName, String answer, String comment) {
		this.num = num;
		this.quizName = quizName;
		this.answer = answer;
		this.comment = comment;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
