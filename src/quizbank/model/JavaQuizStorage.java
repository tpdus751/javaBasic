package quizbank.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import quizbank.view.View;

public class JavaQuizStorage {

	ArrayList<Quiz> javaQuizList = new ArrayList<>();
	final int MAX_QUANTITY = 20;
	private String JavaQuizFilename = "JavaQuizList.txt";
	private int lastNum;
	private boolean isSaved;
	
	public JavaQuizStorage() throws IOException {
		loadBookListFromFile();		
		generateLastId();
		isSaved = true;
	}
	
	
		private void loadBookListFromFile() throws IOException {
			FileReader fr;
			try {
				fr = new FileReader(JavaQuizFilename);
				BufferedReader br = new BufferedReader(fr);
				String idStr;
				while ((idStr = br.readLine()) != null) {
					if (idStr.equals("")) continue;
					int num = Integer.parseInt(idStr);
					String quizName = br.readLine();
					String answer = br.readLine();
					String comment = br.readLine();
					javaQuizList.add(new Quiz(num, quizName, answer, comment));
				}
				br.close();
				fr.close();
			} catch (FileNotFoundException |  NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}

		private void generateLastId() {
			lastNum = 0;
			for (Quiz quiz : javaQuizList) {
				int Num = quiz.getNum();
				if (Num > lastNum) {
					lastNum = Num;
				}
			}
			
		}
		
		public void deleteCustomer(int num) {
			javaQuizList.remove(getCustomerByNum(num));
			isSaved = false;
		}

		private Object getCustomerByNum(int num) {
			for (Quiz quiz : javaQuizList) {
				if (quiz.getNum() == num) {
					return quiz;
				}
			}
			return null;
		}

		public void addQuiz(String quizName, String answer, String comment) {
			Quiz quiz = new Quiz(++lastNum, quizName, answer, comment);
			javaQuizList.add(quiz);
			isSaved = false;
		}

		public boolean isSaved() {
			return isSaved;
		}
		
		public void saveBookList2File() {
			
			try {
				FileWriter fw = new FileWriter(JavaQuizFilename);
				for (Quiz quiz : javaQuizList) {
					fw.write(quiz.getNum() + "\n");
					fw.write(quiz.getQuizName() + "\n");
					fw.write(quiz.getAnswer() + "\n");
					fw.write(quiz.getComment() + "\n");;
				}
				fw.close();
				isSaved = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


		public void viewAllQuiz() {
			View view = new View();
			for (Quiz quiz : javaQuizList) {
				view.showMessage("----------------------------------");
				System.out.println(quiz.getNum() + "번 : " + quiz.getQuizName());
				System.out.println("해설 : " + quiz.getComment());
				view.showMessage("----------------------------------");
				System.out.println();
			}
			
		}
		
}
