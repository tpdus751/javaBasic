package quizbank.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CustomerStorage {
	ArrayList<Customer> customerList = new ArrayList<>();
	private String customerFilename = "CustomerList.txt";
	private int lastNum;
	private boolean isSaved;
	
	public CustomerStorage() throws IOException {
		loadBookListFromFile();		
		generateLastId();
		isSaved = true;
	}
	
	private void loadBookListFromFile() throws IOException {
		FileReader fr;
		try {
			fr = new FileReader(customerFilename);
			BufferedReader br = new BufferedReader(fr);
			String idStr;
			while ((idStr = br.readLine()) != null) {
				if (idStr.equals("")) continue;
				int num = Integer.parseInt(idStr);
				String name = br.readLine();
				String id = br.readLine();
				String password = br.readLine();
				customerList.add(new Customer(num, name, id, password));
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException |  NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

	private void generateLastId() {
		lastNum = 0;
		for (Customer customer : customerList) {
			int Num = customer.getNum();
			if (Num > lastNum) {
				lastNum = Num;
			}
		}
		
	}
	
	public void deleteCustomer(int num) {
		customerList.remove(getCustomerByNum(num));
		isSaved = false;
	}

	private Object getCustomerByNum(int num) {
		for (Customer customer : customerList) {
			if (customer.getNum() == num) {
				return customer;
			}
		}
		return null;
	}

	public void addCustomer(String name, String id, String password) {
		Customer customer = new Customer(++lastNum, name, id, password);
		customerList.add(customer);
		isSaved = false;
	}

	public boolean isSaved() {
		return isSaved;
	}
	
	public void saveBookList2File() {
		
		try {
			FileWriter fw = new FileWriter(customerFilename);
			for (Customer customer : customerList) {
				fw.write(customer.getNum() + "\n");
				fw.write(customer.getName() + "\n");
				fw.write(customer.getId() + "\n");
				fw.write(customer.getPassword() + "\n");;
			}
			fw.close();
			isSaved = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 로그인 화면에서 아이디와 비밀번호가 같으면 true
	public boolean isValidCustomer(String id, String password) {
		for (Customer customer : customerList) {
			if (id.equals(customer.getId())) {
				if (password.equals(customer.getPassword())) {
					return true;
				}
			}
		}
		return false;
	}

	
	public boolean isPossibleId(String id) {
		for (Customer customer : customerList) {
			if (id == customer.getId()) {
				return true;
			}
		}
		return false;
	}

	public void count() {
		for (Customer customer : customerList) {
			System.out.println(customer.getNum());
			System.out.println(customer.getId());
			System.out.println(customer.getName());
			System.out.println(customer.getPassword());
		}
	}
	
}
