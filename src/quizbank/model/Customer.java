package quizbank.model;

public class Customer extends User {
	
	private int num;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/tpdus751/QuizBank.git
	
	public Customer(int num, String name, String id, String password) {
<<<<<<< HEAD
		super(name, id, password);
		this.num = num;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	protected void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
=======
		super();
>>>>>>> branch 'master' of https://github.com/tpdus751/QuizBank.git
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
}
