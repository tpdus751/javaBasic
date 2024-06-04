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
			while ((idStr = br.readLine()) != null && idStr.equals("")) {
				int num = Integer.parseInt(idStr);
				String name = br.readLine();
				String id = br.readLine();
				String password = br.readLine();
				String registeredTime = br.readLine();
				customerList.add(new Customer(num, name, id, password, registeredTime));
			}
			fr.close();
			br.close();
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

	public void addBook(String name, String id, String password, String registeredTime) {
		Customer customer = new Customer(++lastNum, name, id, password, registeredTime);
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
				fw.write(customer.getPassword() + "\n");
				fw.write(customer.getRegisteredTime() + "\n");
			}
			fw.close();
			isSaved = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isValidCustomer(String id, String password) {
		for (Customer customer : customerList) {
			if (id == customer.getId()) {
				if (password == customer.getPassword()) {
					return true;
				}
			}
		}
		return false;
	}

	
	
}
