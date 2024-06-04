package quizbank;

import quizbank.controller.Controller;
import quizbank.model.Customer;
import quizbank.model.QuizStorage;
import quizbank.view.View;

public class Test {

	public static void main(String[] args) {
		// 모델 생성
		QuizStorage quizStorage = new QuizStorage();

				
		// 뷰 생성
		View view = new View();
		
		// 고객 생성
		Customer customer = new Customer();
				
		// 컨트롤러 생성
		Controller controller = new Controller(quizStorage, view, customer);
				
				
				
				
				
				
		controller.start();
				

			

	}

}
