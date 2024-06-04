package quizbank.model;

import java.util.ArrayList;

public class QuizStorage {

	ArrayList<Quiz> QuizList = new ArrayList<>();
	final int MAX_QUANTITY = 20;
	private String JavaQuizFilename = "JavaQuizList.txt";
	private boolean isSaved;
}
