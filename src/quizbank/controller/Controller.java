package quizbank.controller;


import quizbank.model.AlgorithmsQuizStorage;
import quizbank.model.Customer;
import quizbank.model.CustomerStorage;
import quizbank.model.InterfaceQuizStorage;
import quizbank.model.JavaQuizStorage;
import quizbank.view.View;


public class Controller {

	JavaQuizStorage quizStorage;
	View view;
	CustomerStorage customerStorage;
	JavaQuizStorage javaQuizStorage;
	AlgorithmsQuizStorage algorithmsQuizStorage;
	InterfaceQuizStorage interfaceQuizStorage;
	Customer customer;


	
	String[] menuList = {
			"0. 로그아웃",
			"1. 과목별 문제 보기",
			"2. 과목별 문제 풀기",
			"3. 과목별 틀린 문제 보기 및 풀기",
			"4. 점수 확인",
			"5. 관리자모드"
	};
	
	String[] adminMenuList = {
			"0. 관리자모드 종료",
			"1. 과목별 문제 추가",
			"2. 과목별 문제 삭제",
			"3. 과목별 문제 수정"
	};
	

	String[] QuizType = {
			"0. 이전으로 돌아가기",
			"1. 자바 문제 확인하기",
			"2. 알고리즘 문제 확인하기",
			"3. 인터페이스 문제 확인하기"
	};
	
	String[] StartAsUserList = {
			"0. 프로그램 종료",
			"1. 로그인",
			"2. 회원가입"
	};
	
	String[] StartQuizType = {
			"0. 이전으로 돌아가기",
			"1. 랜덤 자바 20문제 풀기",
			"2. 랜덤 알고리즘 20문제 풀기",
			"3. 랜덤 인터페이스디자인 20문제 풀기"
	};
	
	
	public Controller(View view, CustomerStorage customerStorage, JavaQuizStorage javaQuizStorage, AlgorithmsQuizStorage algorithmsQuizStorage, InterfaceQuizStorage interfaceQuizStorage) {
		this.interfaceQuizStorage = interfaceQuizStorage;
		this.algorithmsQuizStorage = algorithmsQuizStorage;
		this.javaQuizStorage = javaQuizStorage;
		this.view = view;
		this.customerStorage = customerStorage;
	}
	
	
	public void start() {
		
		view.displayWelcome(customerStorage);
		int loginNum;
		do {
			loginNum = view.selectMenuNo(StartAsUserList);
			switch (loginNum) {
				case 1:
					boolean isTrue = login();
					if (isTrue) {
						int menu;
						
						do {
							menu = view.selectMenuNo(menuList);
							
							switch (menu) {
							case 1:
								viewQuiz();
								break;
							case 2:
								playQuiz();
								break;
	//						case 3:
	//							addBookToCart();
	//							break;
	//						case 4:
	//							removeBookFromCart();
	//							break;
	//						case 5:
	//							changeBookQuantityFromCart();
	//							break;
	//						case 6:
	//							resetCart();
	//							break;
	//						case 7:
	//							order();
	//							break;
	//						case 8:
	//							adminMode(); // 0530 with 교수님
	//							break;
							case 0:
								break;
							default :
								view.showMessage("잘못된 메뉴 번호입니다.");
							}
							
						} while (menu != 0);
						view.showMessage("로그아웃 합니다.");
						break;
					} 
					break;
				case 2:
					registerCustomer();
					break;
				case 0:
					break;
				default :
					view.showMessage("번호를 다시 입력하세요.");
			}
			
		} while (!(loginNum == 0));
		view.showMessage("프로그램을 종료합니다.(다음에 봐요!)");
	}





	private void playQuiz() {
		int menu;
		
		do {
			menu = view.selectMenuNo(StartQuizType);
			
			switch (menu) {
			case 1:
				playJavaQuiz();
				break;
			case 2:
				playAlgorithmsQuiz();
				break;
			case 3:
				playInterfaceQuiz();
				break;
			case 0:
				break;
			default :
				view.showMessage("잘못된 메뉴 번호입니다.");
			}
			
		} while (menu != 0);
	}
		
	private void playInterfaceQuiz() {
		interfaceQuizStorage.printRandomQuizzes();
		
	}


	private void playAlgorithmsQuiz() {
		algorithmsQuizStorage.printRandomQuizzes();
		
	}


	private void playJavaQuiz() {
		javaQuizStorage.printRandomQuizzes();
	}

	


	private void registerCustomer() {
		view.goToRegister(customerStorage);
	}


	private boolean login() {
		return view.goToLogin(customerStorage);
	}


	private void viewQuiz() {
		int menu;
		
		do {
			menu = view.selectMenuNo(QuizType);
			
			switch (menu) {
			case 1:
				viewJavaQuiz();
				break;
			case 2:
				viewAlgorithmsQuiz();
				break;
			case 3:
				viewInterfaceQuiz();
				break;
			case 0:
				break;
			default :
				view.showMessage("잘못된 메뉴 번호입니다.");
			}
			
		} while (menu != 0);
	}


	private void viewInterfaceQuiz() {
		interfaceQuizStorage.viewAllQuiz();
		
	}
	private void viewAlgorithmsQuiz() {
		algorithmsQuizStorage.viewAllQuiz();

	}


	private void viewJavaQuiz() {
		javaQuizStorage.viewAllQuiz();
	}
		
	
}


