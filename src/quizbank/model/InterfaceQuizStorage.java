package quizbank.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import quizbank.view.View;

public class InterfaceQuizStorage {

	ArrayList<Quiz> interfaceQuizList = new ArrayList<>();
	final int MAX_QUANTITY = 20;
	private String InterfaceQuizFilename = "InterfaceQuizList.txt";
	private int lastNum;
	private boolean isSaved;
	
	public InterfaceQuizStorage() throws IOException {
		loadBookListFromFile();		
		generateLastId();
		isSaved = true;
	}
	
	
		private void loadBookListFromFile() throws IOException {
			FileReader fr;
			try {
				fr = new FileReader(InterfaceQuizFilename);
				BufferedReader br = new BufferedReader(fr);
				String idStr;
				while ((idStr = br.readLine()) != null) {
					if (idStr.equals("")) continue;
					int num = Integer.parseInt(idStr);
					String quizName = br.readLine();
					String answer = br.readLine();
					String comment = br.readLine();
					interfaceQuizList.add(new Quiz(num, quizName, answer, comment));
				}
				br.close();
				fr.close();
			} catch (FileNotFoundException |  NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}

		private void generateLastId() {
			lastNum = 0;
			for (Quiz quiz : interfaceQuizList) {
				int Num = quiz.getNum();
				if (Num > lastNum) {
					lastNum = Num;
				}
			}
			
		}
		
		public void deleteCustomer(int num) {
			interfaceQuizList.remove(getCustomerByNum(num));
			isSaved = false;
		}

		private Object getCustomerByNum(int num) {
			for (Quiz quiz : interfaceQuizList) {
				if (quiz.getNum() == num) {
					return quiz;
				}
			}
			return null;
		}

		public void addQuiz(String quizName, String answer, String comment) {
			Quiz quiz = new Quiz(++lastNum, quizName, answer, comment);
			interfaceQuizList.add(quiz);
			isSaved = false;
		}

		public boolean isSaved() {
			return isSaved;
		}
		
		public void saveBookList2File() {
			
			try {
				FileWriter fw = new FileWriter(InterfaceQuizFilename);
				for (Quiz quiz : interfaceQuizList) {
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
			for (Quiz quiz : interfaceQuizList) {
				view.showMessage("----------------------------------");
				System.out.println(quiz.getNum() + "번 : " + quiz.getQuizName());
				System.out.println("해설 : " + quiz.getComment());
				view.showMessage("----------------------------------");
				System.out.println();
			}
			
		}
		
}
