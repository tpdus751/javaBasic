package quizbank;

import java.io.IOException;

import quizbank.controller.Controller;
import quizbank.model.CustomerStorage;
import quizbank.model.JavaQuizStorage;
import quizbank.view.View;

public class Test {

	public static void main(String[] args) throws IOException {
		// 모델 생성
		JavaQuizStorage quizStorage = new JavaQuizStorage();

				
		// 뷰 생성
		View view = new View();
		
		// 고객 생성
		CustomerStorage customerStorage = new CustomerStorage();
		
		// 컨트롤러 생성
		Controller controller = new Controller(quizStorage, view, customerStorage);
		
				
				
				
				
				
				
		controller.start();
				

			

	}

}
